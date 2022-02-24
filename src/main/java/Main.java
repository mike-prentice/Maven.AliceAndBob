/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println('Enter a name...');

        String name = inpt.nextLine();
        if (name == "Alice" || name == 'Bob') {
            System.out.println('Hello there' + name);
        } else {
            System.out.println('Enter another name please...');
        }
    }
}
