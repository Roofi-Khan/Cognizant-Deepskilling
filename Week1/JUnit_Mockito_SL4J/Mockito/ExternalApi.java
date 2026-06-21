package Week1.JUnit_Mockito_SL4J.Mockito;


public interface ExternalApi {

    String getData();

    String getUser(String name);

    void sendMessage(String message);

    void deleteData();
}