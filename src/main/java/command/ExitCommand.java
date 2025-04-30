package command;

import java.util.Scanner;

public class ExitCommand implements  Command{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("종료할까요? (Y/n) ");
        String answer = sc.nextLine();

        sc.close();
        if(answer.isEmpty() || answer.equalsIgnoreCase("y")){
            System.exit(0);
        }
    }
}
