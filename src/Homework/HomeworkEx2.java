package Homework;

public class HomeworkEx2 {
    public static void main(String[] args) {
        String name = "     ПЕтРов Олег Иванович     ";
        String nameTrim = name.trim(); // обрезка пробелов
        String nameUpperCase = nameTrim.toUpperCase(); //перевод в верхних регистр

        if (nameUpperCase.contains("ова")) {
            System.out.println("Уважаемая:" + nameUpperCase);
        } else if (nameUpperCase.contains("ОВ")) {
            System.out.println("Уважаемый:" + nameUpperCase);
        } else {
            System.out.println("Неизвестное лицо");
        }
    }
}
