package cn.bytecode.babel.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "app")
open class ApplicationProperties() {
    var mobileUaPattern = ""
}
