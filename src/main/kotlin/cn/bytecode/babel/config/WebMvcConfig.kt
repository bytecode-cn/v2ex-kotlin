package cn.bytecode.babel.config

import cn.bytecode.babel.interceptor.DeviceInterceptor
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
open class WebMvcConfig : WebMvcConfigurer{

    @Value("\${app.pattern.ua.mobile}")
    lateinit var mobileUaPattern: String

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(DeviceInterceptor(mobileUaPattern))
    }
}