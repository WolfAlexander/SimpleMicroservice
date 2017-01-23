package webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ServiceConnection implements RestApiRequest {
    @Autowired
    private RestTemplate template;

    @Override
    public String requestString(String restEndpointURL) {
            return template.getForObject(restEndpointURL, String.class);
    }
}
