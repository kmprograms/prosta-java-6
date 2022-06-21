import java.util.regex.Pattern;

/*
    Zadanie
    W przykładowym napisie zlicz wszystkie grupy powtarzających się znaków.
    Przykładowo dla napisu "kkmmmm    progggrams" mamy 4 takie grupy:
    "kk", "mmmm", "    " oraz "ggg"
*/
public class App {
    static int countGroups(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Text is null or empty");
        }

        var counter = 0;
        var pattern = Pattern.compile("(.)\\1+");
        var matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.printf("GROUP: _%s_%n", matcher.group());
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        var text = "kkmmmm    progggrams";
        System.out.println(countGroups(text));
    }
}
