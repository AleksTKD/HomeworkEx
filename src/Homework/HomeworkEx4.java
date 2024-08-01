package Homework;

public class HomeworkEx4 {
    public static void main(String[] args) {
        String simply = "this is simply. This is my favorite song.";
        //замена строки
        String NewSimply = simply.replace ("this is","those are");
        //получение длины строки и индекса второй буквы "о"
        int firstIndexO = NewSimply.indexOf('o');
        int secondIndexO = NewSimply.indexOf('o',firstIndexO + 1);
        System.out.println("Замененная строка:" + NewSimply);
        System.out.println("Индекс (номер) второй буквы \"о\" в строке:" + secondIndexO);
    }
}

