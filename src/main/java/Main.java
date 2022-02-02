
public class Main {

    public static void main(String[] args) {
        try {
            var s = Downloader.getText(args[0]);
            var result = Parser.findUniqueWords(s);
            for (var entry : result.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
