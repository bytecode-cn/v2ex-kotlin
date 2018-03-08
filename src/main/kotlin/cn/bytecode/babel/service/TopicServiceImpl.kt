package cn.bytecode.babel.service

import cn.bytecode.babel.domain.Topic
import cn.bytecode.babel.repository.TopicRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
internal class TopicServiceImpl(val topicRepository: TopicRepository) : TopicService {
    override fun getTopic(id: Int): Topic? {
        return topicRepository.getOne(id)
    }

    override fun getTopics(): List<Topic> {
        return topicRepository.findAll()
    }

}