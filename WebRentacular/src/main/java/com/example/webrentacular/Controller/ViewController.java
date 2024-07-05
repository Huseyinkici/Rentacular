package com.example.webrentacular.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/kayit")
    public String kayitSayfa() {
        return "kayit";
    }
}
