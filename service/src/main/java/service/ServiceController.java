package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public String getDate(){
        return repository.findOne(1L).getValue();
    }

}
