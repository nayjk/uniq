import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Collection {
    public static void main(String[] args) throws IOException {
        ArrayList<String> kitty = new ArrayList<String>();
        kitty.add("Соня");
        kitty.add("Джерри");
        kitty.add("Марси");
        kitty.add("Марси");
        kitty.add("Софа");
        Set<String> uniq = new HashSet<String>(kitty);
        String s = uniq.toString();
        System.out.println("Введёная строка: " + s);
    }
}
