import java.util.*;


public class task004 {
    private static final boolean False = false;
    private static String list;

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
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

    for (int i = 0; i < 20; i++) {
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

private static void ex3() {
    String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
    List<String> randomSolarSystem = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < 20; i++) {
        randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
    }
    //randomSolarSystem.sort(Comparator.naturalOrder());
    
    int Earth = list.indexOf("Earth");
    boolean isFound = False;

    for (int i = 0; i < randomSolarSystem.size(); i++) {
        if (randomSolarSystem.contains(planetsNamesStringArray[i]) && isFound) {
            randomSolarSystem.remove(planetsNamesStringArray[i]);
        }
    }
}
}