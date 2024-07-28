package Homework;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите знак операции - \" + \",\" - \", \" * \", \" /\"");
        String operation = scanner.nextLine();
        System.out.println("Введите второе число");
        double number2 = Double.parseDouble(scanner.nextLine());

        double result;
        if(operation.equals("+")){
            result = number1 + number2;
            System.out.println("Результат:" + result);
        } else if (operation.equals("-")) {
            result = number1 - number2;
            System.out.println("Результат:" + result);
        } else if (operation.equals("*")) {
            result = number1 * number2;
            System.out.println("Результат:" + result);
        } else if (operation.equals("/")) {
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                result = 0; // результат при делении на ноль чтобы не выдавало infinity
            }
            System.out.println("Результат:" + result);
        } else {
            System.out.println("Ошибка, знак операции не относится к вышеперечисленным");
        }

        scanner.close();
    }
}
