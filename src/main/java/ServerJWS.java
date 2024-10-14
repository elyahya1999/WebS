import jakarta.xml.ws.Endpoint;
import ma.emsi5.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:4415/", new BanqueService());
        System.out.println("Server is running...");
    }
}
