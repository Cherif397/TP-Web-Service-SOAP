import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9991/",new BanqueService());
        System.out.println("Web service demarre sur http://0.0.0.0:9991/");
    }
}
