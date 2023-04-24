import java.util.Scanner;

public class ReverseString {

    private String resultString = "";
    char ch;

    public String funReverseString(String sb) {
        for (int i = 0; i < sb.length(); i++) {
            ch = sb.charAt(i); //extracts each character
            resultString = ch + resultString; //adds each character in front of the existing string
        }
        return resultString;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.funReverseString(String.valueOf(s)));

    }
}
