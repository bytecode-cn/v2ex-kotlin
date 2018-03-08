package cn.bytecode.babel.service

import cn.bytecode.babel.domain.Topic

interface TopicService {
    fun getTopic(id: Int): Topic?
    fun getTopics(): List<Topic>
}