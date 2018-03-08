package cn.bytecode.babel.repository

import cn.bytecode.babel.domain.Topic
import org.springframework.data.jpa.repository.JpaRepository

internal interface TopicRepository : JpaRepository<Topic, Int>