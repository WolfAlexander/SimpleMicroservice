package webservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class WebController{
    private RestApiRequest restApiRequest = new ServiceConnection();

    @GetMapping("/")
    public String home(FormInput form){
        return "index";
    }

    @PostMapping( "/getdata")
    public String showResult(@Valid FormInput form, Model model, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "index";
        else{
            String value = restApiRequest.requestString("http://SERVICE/service");

            model.addAttribute("db_value", value);
            model.addAttribute("data", form.getData());
            return "result";
        }
    }
}
