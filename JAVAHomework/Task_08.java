package JAVAHomework;

import java.util.ArrayList;

public class Task_08 {
    public static void main(String[] args) {
        ArrayList<String> classic = new ArrayList<>(); // классика
        classic.add("Преступление и наказание");
        classic.add("Война и мир");
        classic.add("Анна Каренина");
        ArrayList<String> fantastic = new ArrayList<>(); // научная фантастика
        fantastic.add("Солярис");
        fantastic.add("Ночной дозор");
        fantastic.add("Братья Стругацкие");
        ArrayList<String> detective = new ArrayList<>(); //детектив
        detective.add("Десять негритят");
        ArrayList<String> fantasy = new ArrayList<>(); // фэнтази
        fantasy.add("Хроники Нарнии");
        fantasy.add("Гарри Поттер и философский камень");
        fantasy.add("Грозовой перевал");
        ArrayList<String> classicBook = new ArrayList<>();
        classicBook.addAll(classic);
        ArrayList<String> fantasticBook = new ArrayList<>();
        fantasticBook.addAll(fantastic);
        ArrayList<String> detectiveBook = new ArrayList<>();
        detectiveBook.addAll(detective);
        ArrayList<String> fantasyBook = new ArrayList<>();
        fantasyBook.addAll(fantasy);
        ArrayList<String> books = new ArrayList<>(); // наши книги всех жанров
        books.addAll(classicBook);
        books.addAll(fantasticBook);
        books.addAll(detectiveBook);
        books.addAll(fantasyBook);
        for (String book: books){
            System.out.println(book);
        }
    }
}
