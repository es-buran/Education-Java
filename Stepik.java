/*
https://stepik.org/lesson/399104/step/9?unit=388195
Структура программы и первая команда  
 */
package stepik;

/**
 * Комментарии Javadoc используются для документирования кода. Документированный
 * код может быть превращен в HTML-страницу, которая будет полезна для других
 * Каждая программа на языке Java должна иметь класс. Каждая Java программа
 * начинается с метода main.
 */
class C0Stepik {

    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Эта строчка должна быть на новой строке!");
        System.out.print("И эта, так как предыдущая команда выполнила переход на новую строку");
        System.out.print(" --- а эта нет, так как просто System.out.print() по");
        System.out.println("сле себя строку не переводит");
    }
}

class C104Les01Path {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        int v = sc.nextInt();
        System.out.println(t * v);
    }
}

class C104Les02Bigger {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x >= y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}

class C104Les03Increment {

    public static void main(String[] args) {
        int first = 15;
        int second = --first;
        second *= 2;
        int third = second - 13;
        if (first == third) {
            System.out.println(--second);
        } else {
            System.out.println(third - first + second);
        }
    }
}

class C104Les04Equals {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        if (!s1.equals(s2)) {
            System.out.println("No");
        } else {
            if (!s2.equals(s3)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}

class C104Les05Del {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (y == 0) {
            System.out.println("Error");
        } else {
            System.out.println(x / y);
        }
    }
}

class C104Les05Del_v2 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // Перечисление переменных
        double a = sc.nextDouble(), b = sc.nextDouble();
        // Вывод с условием
        System.out.print(b != 0 ? a / b : "Error");
    }
}

class C104Les06RedHat {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 20) {
            //услуги Лесничего дешевле
            System.out.println(x - 10);
        } else {
            //услуги Волка дешевле
            System.out.println(x / 2);
        }
    }
}

class C104Les07Peter {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        if (x <= ((h * 60 * 60) + (m * 60))) {
            System.out.println("Успел");
        } else {
            System.out.println("Опоздал");
        }
    }
}

class C104Les08Bigger {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if ((x >= y) && (x >= z)) {
            System.out.println(x);
        } else {
            if ((y >= x) && (y >= z)) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }
    }
}

class C104Les09VisokGod {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int y = sc.nextInt();
        // год, номер которого кратен 400 — високосный;
        if ((y % 400) == 0) {
            System.out.println("Yes");
        } else {
            // остальные годы, номер которых кратен 100 — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
            if ((y % 100) == 0) {
                System.out.println("No");
            } else {
                // остальные годы, номер которых кратен 4 — високосные;
                if ((y % 4) == 0) {
                    System.out.println("Yes");
                } else {
                    // все остальные годы — невисокосные.
                    System.out.println("No");
                }
            }
        }
    }
}

class C104Les10EqualsOnly2Strings {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        // Если среди них есть ровно две равные строки то вывести "Yes",
        // в противном случае - "No".
        // Ключевая фраза: "ровно две"
        if (s1.equals(s2) && !s1.equals(s3)) {
            System.out.println("Yes");
        } else {
            if (s1.equals(s3) && !s1.equals(s2)) {
                System.out.println("Yes");
            } else {
                if (s2.equals(s3) && !s2.equals(s1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}

class C104Les11Chocolate {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (((k % n) == 0 || (k % m) == 0) && (k < (n * m))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

class C104Les12Pool {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        // определяем, какой из бортов длинный, а какой короткий
        int longB, shortB;
        if (n >= m) {
            longB = n;
            shortB = m;
        } else {
            longB = m;
            shortB = n;
        }
        // определяем минимальные расстояния до бортов
        int minX, minY;
        if (x >= (shortB - x)) {
            minX = shortB - x;
        } else {
            minX = x;
        }
        if (y >= (longB - y)) {
            minY = longB - y;
        } else {
            minY = y;
        }
        // Выводим на печать минимальное расстояние (под прямым углом к бортику)
        if (minX >= minY) {
            System.out.println(minY);
        } else {
            System.out.println(minX);
        }
    }
}

class C105Les01Temperature {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        float t = sc.nextFloat();
        if (t < 22.4f) {
            System.out.println("Холодно" + (char) 40);
        } else {
            if (t == 22.4f) {
                System.out.println("Прохладно...");
            } else {
                System.out.println("Тепло!");
            }
        }
    }
}

class C105Les02Num1 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if ((n >= 10) && (n <= 99)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class C105Les03Num2 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // Вводится целое число n (0 < n < 1000).
        // Определите, сколько в нём цифр. Выведите ответ на экран.
        int n = sc.nextInt();
        int count = 1;
        if (n >= 10) {
            count++;
            if (n >= 100) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class C105Les04Equation1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a == 0) && (b == 0)) {
            System.out.println("inf");
        } else {
            if (a == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}

class C105Les05Equation2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int d = (b * b) - (4 * a * c);
        
        if (d < 0) {
            System.out.println("0");
        } else {
            if (d == 0) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}

class C105Les06Equation3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int d = (b * b) - (4 * a * c);
        
        if (a != 0) {
            // a != 0
            if (d < 0) {
                System.out.println("0");
            } else {
                if (d == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }
        } else {
            // a == 0
            if ((b == 0) && (c == 0)) {
                System.out.println("inf");
            } else {
                if (b == 0) {
                    System.out.println("0");
                } else {
                    System.out.println("1");
                }
            }
        }
    }
}

class C105Les07Dot1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // y=2*x
        if ((y > (2 * x)) && (x < (y / 2))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class C105Les08Dot2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // between y=3*x and y=2*x and y>0
        if ( y<(3*x) && y>(2*x) && x<(y/2) && x>(y/3) && y>0 ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class C105Les09Dot3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // between y=x/2 and y=x*x-2*x-3
        if ((y < (x / 2)) && (y > (x * x - 2 * x - 3))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


class C105Les10Dot4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // between y=x*x-3 and y*y+x*x=5
        if ((x > Math.sqrt(5)) || (x < -Math.sqrt(5)) || (y > Math.sqrt(5)) || (y < -Math.sqrt(5))) {
            System.out.println("No");
        } else {
            if ((y < (x * x - 3)) && (y < Math.sqrt(5 - x * x)) && (x < Math.sqrt(5 - y * y))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

class C105Les11Dot5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // between y=x*x-3 and y*y+x*x=5 and upper y=0.5*x-1
        if ((x > Math.sqrt(5)) || (x < -Math.sqrt(5)) || (y > Math.sqrt(5)) || (y < -Math.sqrt(5))) {
            System.out.println("No");
        } else {
            if ((y < (x * x - 3)) && (y < Math.sqrt(5 - x * x)) && (x < Math.sqrt(5 - y * y)) && (y > x / 2 - 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

class C105Les12Dot6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // between y=x*x-3 and y*y+x*x=5 and upper y=0.5*x-1
        String myResult = "none";
        
        // Сперва решение первой половины задачи (как в "Точка 5")
        if ((x > Math.sqrt(5)) || (x < -Math.sqrt(5)) || (y > Math.sqrt(5)) || (y < -Math.sqrt(5))) {
            myResult = "other";
        } else {
            if ((y < (x * x - 3)) && (y < Math.sqrt(5 - x * x)) && (x < Math.sqrt(5 - y * y)) && (y > x / 2 - 1)) {
                myResult = "Yes";
            }
        }
        
        // Затем решение второй половины задачи (если точка всё еще не найдена)
        if (!myResult.equals("Yes")) {
            // Будем работать только с нижней прямоугольной областью
            if ((x > 1) || (x < -1) || (y > -2) || (y < -3)) {
                myResult = "No";
            } else {
                if ((y > (x * x - 3)) && (y < -Math.sqrt(5 - x * x))) {
                    myResult = "Yes";
                } else {
                    myResult = "No";
                }
            }
        }
        // Выводим результат
        System.out.println(myResult);
    }
}


class C105Les12Dot6_v2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        double f1 = x * x - 3;
        double f2 = x * x + y * y;
        double f3 = 0.5 * x - 1;
        
        if ((5 > f2 && y < f1 && y > f3) || (5 < f2 && y > f1 && y < f3)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

class C106Les01Vasya {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
        
        if (x < 21) {
            System.out.println("Нет");
        }
        else {
            System.out.println("Да");
        }
    }
}


class C106Les02 {
    public static void main(String[] args) {
        int a = 255;
        int b = a++;
        a /= 8;
        b *= 2;
        int c = b / 10;
        if (a + b + c > 600){
            System.out.println(--b);
        }else{
            System.out.println(c++);
        }
    }
}

class C106Les03Vasya {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x < 21) ? "Нет" : "Да");
    }
}

class C106Les04Triangle {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a + b > c) && (a + c > b) && (b + c > a) && a != 0 && b != 0 && c != 0 ? "Yes" : "No");
    }
}

class C106Les05Quarter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(x1 * x2 > 0 && y1 * y2 > 0 ? "YES" : "NO");
    }
}

class C106Les06Lada {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(x1 == x2 || y1 == y2 ? "YES" : "NO");
    }
}

class C106Les06Bishop {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(Math.abs(x1 - x2) == Math.abs(y1 - y2) ? "YES" : "NO");
    }
}

class C106Les07Knight {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println((Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1) || (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2) ? "YES" : "NO");
    }
}

class C106Les08Ferzin {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2) ? "YES" : "NO");
    }
}

class C106Les09Cows {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " коров");
        System.out.print(n == 1 || (n % 10 == 1 && n > 20) ? "а" : "");
        System.out.println((n > 1 && n < 5) || (n % 10 > 1 && n % 10 < 5 && n > 20) ? "ы" : "");
    }
}

class C106Les10Cutlets {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int k = sc.nextInt(); // На сковородку одновременно можно положить k котлет.
        int m = sc.nextInt(); // Каждую котлету нужно с каждой стороны обжаривать m минут непрерывно.
        int n = sc.nextInt(); // За какое наименьшее время удастся поджарить с обеих сторон n котлет?
        // Для округления частного в большую сторону буду
        // использовать формулу алгебры: xBig(a/b) = (a+b-1)/b
        int k2n = (2 * n + k - 1) / k; // Количество подходов к сковородке с максимальным заполнением её сторонами котлет
        System.out.println(m * k2n);
    }
}

class C106Les11Arrange {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(Math.min(a,Math.min(b,c)) + " "); // Min
        System.out.print( a < b && a < c ? Math.max(a,Math.min(b,c)) : Math.min(a,Math.max(b,c))); // Middle
        System.out.println(" " + Math.max(a,Math.max(b,c))); // Max
    }
}

class C106Les12RomanNumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt(); // 1 ≤ x ≤ 100
        if (x >= 10) {
            System.out.print(x == 100 ? "C" : "");
            System.out.print(x >= 90 ? "XC" : "");
            System.out.print(x >= 80 && x < 90 ? "LXXX" : "");
            System.out.print(x >= 70 && x < 80 ? "LXX" : "");
            System.out.print(x >= 60 && x < 70 ? "LX" : "");
            System.out.print(x >= 50 && x < 60 ? "L" : "");
            System.out.print(x >= 40 && x < 50 ? "XL" : "");
            System.out.print(x >= 30 && x < 40 ? "XXX" : "");
            System.out.print(x >= 20 && x < 30 ? "XX" : "");
            System.out.print(x >= 10 && x < 20 ? "X" : "");
            x %= 10;
        }
        System.out.print(x == 9 ? "IX" : "");
        System.out.print(x == 8 ? "VIII" : "");
        System.out.print(x == 7 ? "VII" : "");
        System.out.print(x == 6 ? "VI" : "");
        System.out.print(x == 5 ? "V" : "");
        System.out.print(x == 4 ? "IV" : "");
        System.out.print(x == 3 ? "III" : "");
        System.out.print(x == 2 ? "II" : "");
        System.out.print(x == 1 ? "I" : "");
    }
}

class C106Les12RomanNumbers_v2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt(); // 1 ≤ x ≤ 100
        sc.close();
        
        System.out.print( x == 100 ? "C" : "");
        x %= 100;
        System.out.print( x >= 90 ? "XC" :
                          x >= 80 ? "LXXX" :
                          x >= 70 ? "LXX" :
                          x >= 60 ? "LX" :
                          x >= 50 ? "L" :
                          x >= 40 ? "XL" :
                          x >= 30 ? "XXX" :
                          x >= 20 ? "XX" :
                          x >= 10 ? "X" : "");
        x %= 10;
        System.out.print( x >= 9 ? "IX" :
                          x >= 8 ? "VIII" :
                          x >= 7 ? "VII" :
                          x >= 6 ? "VI" :
                          x >= 5 ? "V" :
                          x >= 4 ? "IV" :
                          x >= 3 ? "III" :
                          x >= 2 ? "II" :
                          x >= 1 ? "I" : "");
    }
}

class C107Les01Step2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int i = 1;
        while (i*i <= n) {
            System.out.println(i*i++);
        }
    }
}

class C107Les02Summ {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); // a <= b
        sc.close();
        
        int i = a;
        int x = 0;
        while (i <= b) {
            x += i;
        }
        System.out.println(x);
    }
}

class C107Les03Quantity {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); // a <= b
        sc.close();
        
        int i = a;
        int k = 0;
        while (i <= b) {
            if (i%3 == 0 && i%5 != 0) {
                k++;
            }
            i++;
        }
        System.out.println(k);
    }
}

class C107Les04Input {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = 1;
        double x = 0;
        int k = 0;
        while (a != 0) {
            a = sc.nextInt();
            x += a;
            if (a != 0) k++;
        }
        System.out.println(x/k);
    }
}

class C107Les05MaxFromInput {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        while (a != 0) {
            a = sc.nextInt();
            x = Math.max(x,a);
        }
        System.out.println(x);
    }
}

class C107Les06EvenNumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); // a <= b
        while (a <= b) {
            if (a % 2 == 0) System.out.println(a);
            a++;
        }        
    }
}

class C107Les07MinDivision {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt(); // a > 2
        int d = a;
        int minD = a;
        while (d > 1) {
            if (a % d == 0) minD = d;
            d--;
        }
        System.out.println(minD);
    }
}

class C107Les08Summ2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int summa = 0;
        int i = 0;
        while (i++ < n) summa += i * i;
        System.out.println(summa);
    }
}

class C107Les09Running {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double dist = x;
        int n = 1;
        while (dist < y) {
            dist += dist/10;
            n++;
        }
        System.out.println(n);
    }
}

class C107Les10Summ {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        int summa = 0;
        int i = num;
        while (i != 0) {
            summa += i % 10;
            i /= 10;
        }
        System.out.println(summa);
    }
}

class C107Les11Chain {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        int nPred = num;
        int count = 0;
        while (num != 0) {
            num = sc.nextInt();
            if (num > nPred) count++;
            nPred = num;
        }
        System.out.println(count);
    }
}

class C107Les12Chain2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        int nMax = num;
        int nPreMax = 0;
        while (num != 0) {
            num = sc.nextInt();
            if (num > nMax) {
                nPreMax = nMax;
                nMax = num;
            }
            if (num > nPreMax && num < nMax) nPreMax = num;
        }
        System.out.println(nPreMax);
    }
}

class C108Les01 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) System.out.println(i++);
    }
}

class C108Les02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        while (i <= b) System.out.println(i++);
    }
}

class C108Les03 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b >= a) while (a <= b) System.out.println(a++);
        else        while (a >= b) System.out.println(a--);
    }
}

class C108Les04 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % k == 0) System.out.println(i);
            i++;
        }
    }
}

class C108Les05 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = 1;
        int i = 0;
        while (a != 0) {
            a = sc.nextInt();
            if (a != 0) i++;
        }
        System.out.println(i);
    }
}

class C108Les06 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = 1;
        int summ = 0;
        while (a != 0) {
            a = sc.nextInt();
            summ += a;
        }
        System.out.println(summ);
    }
}

class C108Les07 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int summ = x;
        while (summ < n) summ += x;
        System.out.println(summ);
    }
}

class C108Les08 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = 1;
        int pr = x;
        while (pr < n) {
            x = sc.nextInt();
            pr *= x;
            k++;
        }
        System.out.println(k + " " + pr);
    }
}

class C108Les09 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int s;
        while (i <= n) {
            s = 1;
            while (s++ <= i) System.out.print("*");
            i++;
            System.out.println("");
        }
    }
}

class C108Les10 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int s;
        while (i <= n) {
            s = 0;
            while (s < (n - i)) {
                System.out.print(" ");
                s++;
            }
            s = 1;
            while (s <= (2 * i - 1)) {
                System.out.print("*");
                s++;
            }
            i++;
            System.out.println("");
        }
    }
}

class C109Les01 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int i = 1;
        int s = num;
        while (i < n) {
            num = sc.nextInt();
            s += num;
            i++;
        }
        System.out.println(s);
    }
}

class C109Les02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int num;
        int i = 1;
        int k = 0;
        while (i++ <= n) {
            num = sc.nextInt();
            if (num % 2 == 0) k++;
        }
        System.out.println(k);
    }
}

class C109Les03 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        for (int i = a; i <= b; i++) s += i;
        System.out.println(s);
    }
}

class C109Les04 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int s = 0;
        for (int n = sc.nextInt(); n % 7 != 0; n = sc.nextInt()) {
            if (n % 7 == 0) break;
            if (n % 10 == 7) s += n;
                else continue; // лишнее, но раз задание требует использовать =)
        }
        System.out.println(s);
    }
}

class C109Les05 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a = "";
        boolean is_0 = false;
        while (!a.equals("СТОП")) {
            a = sc.nextLine();
            if (a.equals("Куб")) is_0 = true;
        }
        System.out.println(is_0 ? "YES" : "NO");
    }
}

class C109Les06 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt(); // i == 1
        int min = num;
        int max = num;
        for (int i = 2; i <= n; i++) {
            num = sc.nextInt();
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println(min);
        System.out.println(max);
    }
}

class C109Les07 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        System.out.println(f);
    }
}

class C109Les08 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a = "";
        int x = 1;
        int n;
        boolean is0 = false;
        while (true) {
            a = sc.nextLine();
            if (a.equals("СТОП")) break;
            n = Integer.parseInt(a);
            if (n != 0) {
                x *= n;
                is0 = true;
            }
        }
        System.out.println(is0 ? x : "Не найдено");
    }
}

class C109Les09 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int p = 1;
        int pi;
        for (int ia = 1; ia <= n; ia++) {
            pi = 1;
            for (int in = 1; in <= ia; in++) pi *= a;
            p += pi;
        }
        System.out.println(p);
    }
}

class C109Les10 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            if (n % 2 == 0 && n / 2 == 0) break;
            System.out.print(n % 2);
            n /= 2;
        }
    }
}

class C109Les11 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a;
        int n = 0;
        int i = 0;
        boolean is0 = false;
        while (true) {
            a = sc.nextLine();
            if (a.equals("СТОП")) break;
            if (a.equals("ээээ") || a.equals("потом")) continue;
            i++;
            if (a.equals("Куб") && !is0) {
                is0 = true;
                n = i;
            }
        }
        System.out.println(is0 ? n : "NO");
    }
}

class C109Les12 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n;
        int maxN = 10001;
        int k = 0;
        int maxVal = 0;
        for (int i = 1; i <= maxN; i++) {
            n = sc.nextInt();
            if (n == 0) break;
            if (n > maxVal) {
                maxVal = n;
                k = 1;
                continue;
            }
            if (n == maxVal) k++;
        }
        System.out.print(k);
    }
}

class C110Les01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) System.out.println("Привет");
    }
}

class C110Les02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) s += i;
        System.out.println(s);
    }
}

class C110Les03 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) s += i*i;
        System.out.println(s);
    }
}

class C110Les04 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) System.out.println(i + " " + i + ".$");
    }
}

class C110Les05 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong();
        long s = 1;
        for (long i = 1; i <= n; i++) s *= sc.nextLong();
        System.out.println(s);
    }
}

class C110Les06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) System.out.print(i + ((i != 9)? " " : ""));
    }
}

class C110Les07 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long x = 1;
        for (int i = a; i <= b; i++) x *= i;
        System.out.println(x);
    }
}

class C110Les08 {
    public static void main(String[] args) {
        for (int i = 50; i >= 0; i -= 10) System.out.println(i);
    }
}

class C110Les09 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); // a >= b
        int c = sc.nextInt();
        for (int i = a; i >= b; i -= c) System.out.println(i);
    }
}

class C110Les10 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);
        String name;
        String age;
        float s = 0;
        for (int i = 1; i <= n; i++) {
            name = sc.nextLine();
            age = sc.nextLine();
            s += Integer.parseInt(age);
        }
        System.out.println(s / n);
    }
}

class C110Les11 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++)
            System.out.println(n + " * " + i + " = " + n * i);
    }
}

class C110Les12 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println( ":)\\_____/(:\n" +
                                " {(@)v(@)}\n" +
                                " {|~- -~|}\n" +
                                " {/^'^'^\\}\n" +
                                " ===m-m===" );
            System.out.println("");
        }
    }
}

class C110Les13 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (n > 0) {
            if (n % 10 == 0) {
                x = 0;
                break;
            }
            x *= n % 10;
            n /= 10;
        }
        System.out.println(x);
    }
}

class C111Les01 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); // a <= b
        for (int i = b; i >= a; i -= 2) System.out.println(i);
    }
}

class C111Les02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int x;
        boolean is4 = false;
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x % 10 == 4) is4 = true;
        }
        System.out.println(is4 ? "Yes" : "No");
    }
}

class C111Les03 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int counter = 1;
        boolean pin_code_coincided = false;
        while (counter <= 5) {
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            if (correct.equals(vasya)) {
                System.out.println("CORRECT");
                pin_code_coincided = true;
                break;
            }
            System.out.println("INCORRECT " + counter);
            counter++;
        }
        if (!pin_code_coincided) System.out.println("Error");
    }
}

class C111Les04 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // k > n
        int x = k - 2 * n;
        System.out.println(x < 0 ? "Никогда" : 2020 + x);
    }
}

class C111Les05 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) k++;
        }
        System.out.println(k);
    }
}

class C111Les06 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // 2 <= k <= 10
        while (n != 0) {
            System.out.print(n % k);
            n /= k;
        }
    }
}

class C111Les07 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int k3 = 0;
        int kN = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n < 0) kN++;
            if (n % 3 == 0) k3++;
        }
        System.out.println((k3 > kN) ? "333" : (k3 == kN) ? "Equal" : "negative");
    }
}

class C111Les08 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String name = "";
        String nameHmin = "";
        String nameHmax = "";
        int h = 0;
        int hMin = 0;
        int hMax = 0;
        for (int i = 1; i <= n; i++) {
            name = sc.next();
            h = sc.nextInt();
            if (i == 1) {
                nameHmin = name;
                nameHmax = name;
                hMin = h;
                hMax = h;
            } else {
                if (h < hMin) {
                    hMin = h;
                    nameHmin = name;
                } else if (h > hMax) {
                    hMax = h;
                    nameHmax = name;
                }
            }
        }
        System.out.println(nameHmin);
        System.out.println(nameHmax);
    }
}

class C112Les01 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = 1000; // Количество элементов массива
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = i * i * i;
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println(mas[i1]);
        System.out.println(mas[i2]);
    }
}

class C112Les02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt(); // Количество элементов массива
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt(); // Наполнение массива
        int x = sc.nextInt(); // Запрос множителя
        for (int i = 0; i < n; i++)
            mas[i] *= x; // Коррекция элементов массива
        for (int i = 0; i < n; i++)
            System.out.println(mas[i]); // Вывод массива
    }
}

class C112Les03 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt(); // Количество элементов массива
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) mas[i] = sc.nextInt(); // Наполнение массива
        int s = 0;
        for (int i = 0; i < n; i++) s += mas[i]; // Сумма
        System.out.println(s);
        for (int i = (n-1); i >= 0; i--)
            System.out.println(mas[i]); // Вывод массива
    }
}
// the END
