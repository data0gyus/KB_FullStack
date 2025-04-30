package TIL.practice0416.Adbanced.exam02;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static String read(String title){
        System.out.print(title);
        return sc.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.printf("%s(%s) : ", title, defaultValue);
        String a = sc.nextLine();

        return a.isEmpty() ? defaultValue : a;
    }

    public static int readInt(String title){
        System.out.print(title);
        int a = sc.nextInt();
        sc.nextLine();
        return a;
    }
    public static boolean confirm(String title, boolean defaultValue){
        String y_n = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s : ", title, y_n);

        String a = sc.nextLine();
        if (a.isEmpty()){
            return defaultValue;
        }
        return a.equalsIgnoreCase("y");
    }

    public static boolean confirm(String title){
        return confirm(title, true);
    }
}
