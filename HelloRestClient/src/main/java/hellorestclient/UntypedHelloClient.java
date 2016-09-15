package hellorestclient;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
public class UntypedHelloClient {
 public static void main(String[] args) {
 try{
 // Create a new RESTeasy client through the JAX-RS API:
 Client client = ClientBuilder.newClient();
 // The base URL of the service:
 WebTarget target = client.target("http://localhost:8088/TestRest/rest");
 // Building the relative URL manually for the sayHello method:
 WebTarget hello =
 target.path("hello").path("sayHello").queryParam("name", "me");
 // Get the response from the target URL:
 Response response = hello.request().get();
 // Read the result as a String:
 String result = response.readEntity(String.class);
 // Print the result to the standard output:
 System.out.println(result);
 // Close the connection:
 response.close();
 } catch (Exception ex) {
 ex.printStackTrace();
 }
 }
}