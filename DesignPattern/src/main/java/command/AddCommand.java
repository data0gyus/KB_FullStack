package command;

import java.util.Scanner;

public class AddCommand implements Command {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 2 : ");
        int num2 = sc.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
    }
}
