import java.util.Scanner;
public class task001 {
    public static void main(String[] args) {

        // String[] c = new String[]{"A", "B"};
        char c1 = 'A';
        char c2 = 'B';
        Scanner cs = new Scanner(System.in);
        System.out.print("Input amount of chars: ");
        int amountOfChar = cs.nextInt();
        String result = "";
        char tmpC = c2;
        for (int i = 0; i < amountOfChar; i++){
            if (tmpC == c1){
                result += c2;
                tmpC = c2;
            }else{
                result += c1;
                tmpC = c1;
            }
        }
        System.out.print(result);
    }
}
