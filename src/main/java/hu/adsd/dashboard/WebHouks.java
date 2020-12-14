package hu.adsd.dashboard;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebHouks {

    @GetMapping (value = "/rest/webhooks/webhook1")
    @ResponseBody
    public String respondToPhoneCall(){
        return "Welcome to Spring Boot";
    }


    @PostMapping (value = "/rest/webhooks/webhook1")
    @ResponseBody
    public String postrespondToPhoneCall(){
        
    }

}
