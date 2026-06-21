package Week1.JUnit_Mockito_SL4J.Mockito_Advanced.Exercise1;

public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String processData() {
        return "Processed " + repository.getData();
    }
}
