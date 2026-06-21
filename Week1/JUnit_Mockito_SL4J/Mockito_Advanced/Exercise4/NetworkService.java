package Week1.JUnit_Mockito_SL4J.Mockito_Advanced.Exercise4;


public class NetworkService {

    private NetworkClient client;

    public NetworkService(NetworkClient client) {
        this.client = client;
    }

    public String connectToServer() {
        return "Connected to " + client.connect();
    }
}
