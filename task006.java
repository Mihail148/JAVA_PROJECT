import java.util.HashMap;
import java.util.Map;

public class task006 {
    public static void main(String[] args) {
        String romeInt = "MMCMXCIX";
        System.out.println(converter(romeInt));



    }



    public static int converter (String str){
        Map<Character, Integer> infoMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
            );
        int previous = 0;    
        int result = 0;

        for (int i = str.length() - 1; i>= 0; i++) {
            int currentValue = infoMap.get(str.charAt(i));
            if (currentValue < previous){
                result -= currentValue;
            }else{
                result += currentValue;
            }
            previous = currentValue;
        }


        return 0;

    }



}