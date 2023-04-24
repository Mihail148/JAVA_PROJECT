package JAVAHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
      ArrayList<String> allCards = new ArrayList<String>();
    allCards.add("Яблоко");
    allCards.add("11");
    allCards.add("13");
    allCards.add("Апельсин");
    allCards.add("Дыня");
    allCards.add("17");

    System.out.println("Наш список перед добавлением: ");
    for (String card : allCards) {
        System.out.print(card + " ");
    }
    System.out.println();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Добавьте чтобы удалить из списка: ");
    String input = scanner.nextLine();
    allCards.remove(input);

    System.out.println("Наш список после добавления: ");
    for (String card : allCards) {
        System.out.print(card + " ");
    }
    scanner.close();  
    }
    
}
