import java.util.*;


public class task004 {
    public static void main(String[] args) {
        ex1();
        ex2();
        
    }



private static void ex1() {
    Random random = new Random();
    List <Integer> list = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
        list.add(random.nextInt(100));
    }

    list.sort(Comparator.reverseOrder());
//        Collections.sort(list, Comparator.reverseOrder());

    System.out.println(list);
}

private static void ex2() {
    String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
    List<String> randomSolarSystem = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < 100; i++) {
        randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
    }
    randomSolarSystem.sort(Comparator.naturalOrder());
    int count = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < planetsNamesStringArray.length; i++) {
        count = 0;
        for (String item :
                randomSolarSystem) {

//          for (int j = 0; j < randomSolarSystem.size(); j++) {
            if (item.equals(planetsNamesStringArray[i]))
                count++;
        }
        sb.append(planetsNamesStringArray[i]).append(": ").append(count).append("\n");

    }
    System.out.println(sb);
}
}