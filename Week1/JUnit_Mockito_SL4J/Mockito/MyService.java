package Week1.JUnit_Mockito_SL4J.Mockito;


public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public String getUser(String name) {
        return api.getUser(name);
    }

    public void notifyUser(String msg) {
        api.sendMessage(msg);
    }

    public void removeData() {
        api.deleteData();
    }
}
