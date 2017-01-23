package webservice;

public class FakeConnection implements RestApiRequest {
    @Override
    public String requestString(String restEndpointURL) {
        return "fake_test_value";
    }
}
