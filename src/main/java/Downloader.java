
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Downloader {
    public static String getText(String uri) throws IOException {
        StringBuilder text = new StringBuilder();
        URL url = new URL(uri);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openConnection().getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            text.append(inputLine);
        in.close();
        return text.toString();
    }
}
