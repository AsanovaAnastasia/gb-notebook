package notebook.util;
import java.util.Scanner;

public class InputUtil {
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}