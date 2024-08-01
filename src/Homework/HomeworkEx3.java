package Homework;

public class HomeworkEx3 {
    public static void main(String[] args) {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (fuel >= 10 || isEngineWork && (isWheelWork1 || isWheelWork2 || isWheelWork3 || isWheelWork4) && !hasErrors) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }
}
