package cn.bytecode.babel.interceptor

import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class DeviceInterceptor(var mobileUaPattern: String) : HandlerInterceptor {
    override fun postHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any, modelAndView: ModelAndView?) {
        if (Regex(pattern = mobileUaPattern).containsMatchIn(request.getHeader("user-agent")))
            modelAndView?.viewName = "${modelAndView?.viewName}_m"
    }
}