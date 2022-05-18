public class Shifr {

    public static void main(String[] args) {
        String text = "uggcf://lbhgh.or/bUt5FWLEUN0";
        String table1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String table2 = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm"; //ROT13
        for (char s : text.toCharArray())
            System.out.print((char) (Character.isLetter(s) ? table2.charAt(table1.indexOf(s)) : s));
        System.out.println();
    }
}