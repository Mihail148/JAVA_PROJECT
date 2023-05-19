/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
*/

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class task007 {
    public static void main(String[] args) {
       HashSet hashSet = new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 3));
       hashSet.add(0);
       hashSet.add(6);

       for(Object item: hashSet){
        System.out.print(item + " ");
       }
       System.out.println();

       LinkedHashSet linkedSet = new LinkedHashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 3));
       linkedSet.add(0);
       linkedSet.add(6);
       
       for(Object item: linkedSet){
        System.out.print(item + " ");
       }
       System.out.println();

       TreeSet treeSet = new TreeSet(Arrays.asList(1, 2, 3, 4, 5, 6, 3));
       treeSet.add(0);
       treeSet.add(6);

       for(Object item: treeSet){
        System.out.print(item + " ");
       }
       System.out.println();
       
       int[] arr = getArray();
       System.out.println(getPercentUniqElement(arr));
    }
}

public static getArray(){
    int[] array = new int[1000];
    Random rnd = new Random();
    
    for (int i = 0; i < array.length; i++) {
        array[i] = rnd.nextInt(24);
    }
    
    
    return array;
}

public static Double getPercentUniqElement(int[] array){
    HashSet<Integer> set = new HashSet<>();
    for (int number: array) {
        set.add(number);
    }
    int setLen = set.size();
    Double result = setLen * 100.0 / array.length;
}


