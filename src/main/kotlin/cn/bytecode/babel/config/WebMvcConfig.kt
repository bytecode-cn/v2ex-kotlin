package cn.bytecode.babel.config

import cn.bytecode.babel.interceptor.DeviceInterceptor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
@EnableConfigurationProperties(ApplicationProperties::class)
open class WebMvcConfig(
        private val applicationProperties: ApplicationProperties
) : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(DeviceInterceptor(applicationProperties.mobileUaPattern))
    }
}
