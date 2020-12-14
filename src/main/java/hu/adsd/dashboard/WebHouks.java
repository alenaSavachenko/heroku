package hu.adsd.dashboard;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebHouks {

    @PostMapping(value = "/rest/webhooks/webhook1",consumes = "application/json", produces = "application/json")
    @ResponseBody
    public String respondToPhoneCall(){
        return "Welcome to Spring Boot";
    }


}
