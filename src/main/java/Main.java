/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.println("Enter a name...");

        String name = userName.nextLine();
        if (name.equals("Alice" )|| name.equals("Bob")) {
            System.out.println("Hello there" + " " + name);
        } else {
            System.out.println("Enter another name please...");
        }
    }
}
