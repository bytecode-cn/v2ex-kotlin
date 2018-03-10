package cn.bytecode.babel.controller

import cn.bytecode.babel.service.TopicService
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TopicController(val topicService: TopicService){

    @GetMapping("/t")
    fun topic(map: ModelMap): String {
        map["topics"] = topicService.getTopics()
        return "topic"
    }

}
