package command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fs = new FileService();

        Command[] commands = {
//                new AddCommand(),
                () -> System.out.println("Add Command"),
//                new OpenCommand(),
//                new PrintCommand(),
//                new ExitCommand()
                fs :: open, // () -> fs.open()
                fs :: print, // () -> fs.print()
                Main::exit // () -> Main.exit()
        };

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.print("선택 : ");
            int a = sc.nextInt();

            commands[a-1].execute();
        }
    }

    private static void exit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("종료할까요? (Y/n) ");
        String answer = sc.nextLine();

        sc.close();
        if(answer.isEmpty() || answer.equalsIgnoreCase("y")){
            System.exit(0);
        }
    }
}
