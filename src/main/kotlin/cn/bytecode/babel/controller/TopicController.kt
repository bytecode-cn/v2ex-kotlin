package cn.bytecode.babel.controller

import cn.bytecode.babel.service.TopicService
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class TopicController(val topicService: TopicService) {

    @GetMapping("/t")
    fun topics(map: ModelMap): String {
        map["topics"] = topicService.getTopics()
        return "topic"
    }

    @GetMapping("/t/{id}")
    fun topic(@PathVariable id: String, map: ModelMap): String {
        map["topic"] = "Hello Topic"
        return "topic"
    }

}
