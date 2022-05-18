public class Robot {

    private static int currentX = 3;
    private static int currentY = 3;
    private static Direction currentDirection = Direction.UP;

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
        return Direction.UP; // текущее направление взгляда
    }

    public int getX() {
        return currentX; // текущая координата X
    }

    public int getY() {
        return currentY; // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (currentDirection) {
            case UP:
                currentDirection = Direction.LEFT;
            case LEFT:
                currentDirection = Direction.DOWN;
            case DOWN:
                currentDirection = Direction.RIGHT;
            case RIGHT:
                currentDirection = Direction.UP;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (currentDirection) {
            case UP:
                currentDirection = Direction.RIGHT;
            case RIGHT:
                currentDirection = Direction.DOWN;
            case DOWN:
                currentDirection = Direction.LEFT;
            case LEFT:
                currentDirection = Direction.UP;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch (currentDirection) {
            case UP:
                currentY++;
            case RIGHT:
                currentX++;
            case DOWN:
                currentY--;
            case LEFT:
                currentX--;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            while (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.LEFT)
                        robot.turnRight();
                    else robot.turnLeft();
                }
                robot.stepForward();
            }
            while (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.RIGHT)
                        robot.turnLeft();
                    else robot.turnRight();
                }
                robot.stepForward();
            }
        }
        if (robot.getY() != toY) {
            while (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    if (robot.getDirection() == Direction.DOWN || robot.getDirection() == Direction.LEFT)
                        robot.turnRight();
                    else robot.turnLeft();
                }
                robot.stepForward();
            }
            while (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.RIGHT)
                        robot.turnRight();
                    else robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);
        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException e) {
            } catch (Throwable e) {
                return;
            }
        }
        throw new RobotConnectionException("Failed to get connection");
    }


    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int count = 0;
        boolean isRun = false;
        while (count < 3) {
            try (RobotConnection con = robotConnectionManager.getConnection()) {
                con.moveRobotTo(toX, toY);
                isRun = true;
                count = 3;
            } catch (RobotConnectionException rce) {
                if (isRun) {
                    count = 3;
                } else {
                    count++;
                    if (count == 3) {
                        throw new RobotConnectionException("3", rce);
                    }
                }
            } catch (Throwable e) {
                throw e;
            }
        }
    }
}