public class task002 {
    public static void main(String[] args) {
        String trash = "aaaabbbcdd";
        String result = "";
        int counter = 1;
        for (int i = 0; i < trash.length() - 1; i++) {
            if (trash.charAt(i + 1) == trash.charAt(i)){
                counter++;
            }else if (trash.charAt(i + 1) != trash.charAt(i) && counter == 1){
                result += trash.charAt(i);
            }
            else{
                result += Character.toString(trash.charAt(i)) + counter;
                counter = 1;
            }
        }
        result += Character.toString(trash.charAt(trash.length() - 1)) + counter;
        System.out.println(result);
    }
}
