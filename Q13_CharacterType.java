import java.util.Scanner;

public class Q13_CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0);

        String type = (ch >= '0' && ch <= '9') ? "digit"
                : ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                    ? ("AEIOUaeiou".indexOf(ch) >= 0 ? "vowel" : "consonant")
                    : "special symbol";

        System.out.println("Character is a " + type + ".");
        sc.close();
    }
}
