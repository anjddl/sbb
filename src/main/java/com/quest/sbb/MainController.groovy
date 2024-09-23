package com.quest.sbb


import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MainController {
    @GetMapping("/Article/list")
    @ResponseBody
    public String index() {
        return index;
    }
}
