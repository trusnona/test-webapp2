package web.social;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
class web{
    @RequestMapping("/")
    String showHome(){
    return "index";
    }
    
    @RequestMapping("/demo")@ResponseBody
    int showDemo(){
        return 555;
    }

    
    @RestController
    class service{
        int showTest(){
            return 555;
        }
    }
}
