package cn.bytecode.babel.repository

import cn.bytecode.babel.domain.Person
import org.springframework.data.jpa.repository.JpaRepository

internal interface PersonRepository : JpaRepository<Person, Int>