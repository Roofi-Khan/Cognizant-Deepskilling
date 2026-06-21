package Week1.JUnit_Mockito_SL4J.Mockito_Advanced.Exercise2;


public class ApiService {

    private RestClient restClient;

    public ApiService(RestClient restClient) {
        this.restClient = restClient;
    }

    public String fetchData() {
        return "Fetched " + restClient.getResponse();
    }
}
