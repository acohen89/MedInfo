
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class MedInfo {

    public static String get(String ur) throws IOException, InterruptedException{
        // Create a neat value object to hold the URL
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ur))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        return ur;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        // System.out.println("Hello, World!"); 
        System.out.println(get("https://www.drugs.com/acetaminophen.html")); 
    }
}