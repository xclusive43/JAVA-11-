import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class HTTP_Client_API_T6 {
    public static void main(String[] args) {
        var uri  = "https://postman-echo.com/get?foo1=bar1&foo2=bar20";
        //n HTTP request.

            // An HttpRequest instance is built through an HttpRequest builder. An HttpRequest builder is obtained from one of the newBuilder methods. A request's URI, headers, and body can be set. Request bodies are provided through a BodyPublisher supplied to one of the POST, PUT or method methods. Once all required parameters have been set in the builder, build will return the HttpRequest. Builders can be copied and modified many times in order to build multiple related requests that differ in some parameters.
            // The following is an example of a GET request that prints the response body as a String:
            // HttpClient client = HttpClient.newHttpClient();
            //    HttpRequest request = HttpRequest.newBuilder()
            //          .uri(URI.create("http://foo.com/"))
            //          .build();
            //    client.sendAsync(request, BodyHandlers.ofString())
            //          .thenApply(HttpResponse::body)
            //          .thenAccept(System.out::println)
            //          .join();
            // The class BodyPublishers provides implementations of many common publishers. Alternatively, a custom BodyPublisher implementation can be used.
        HttpRequest request =  HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .GET()
        .version(Version.HTTP_2)
        .build();

        HttpClient client = HttpClient.newBuilder()
        .build();

        HttpResponse<String> httpResponse;
        try {
            httpResponse = client.send(request, BodyHandlers.ofString());
            System.out.println(httpResponse.statusCode());
            System.out.println(httpResponse.body());
        } catch (IOException |InterruptedException e) {
            e.printStackTrace();
        } 
       
    }
    
}
