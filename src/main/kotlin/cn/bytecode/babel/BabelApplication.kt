package cn.bytecode.babel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BabelApplication

fun main(args: Array<String>) {
    runApplication<BabelApplication>(*args)
}
