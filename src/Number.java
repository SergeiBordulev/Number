import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");

        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("а less 0, а equals to " + a);
        } else if (a == 0) {
            System.out.println("a equals to 0");
        } else {
            System.out.println("a : " + a);
        }
    }
}
