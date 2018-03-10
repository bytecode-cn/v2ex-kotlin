package cn.bytecode.babel.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

    @GetMapping("/")
    fun home(map: ModelMap): String {
        map["V2EXVersion"] = "V2EX 0.0.1-SNAPSHOT"
        return "index"
    }

}
