package com.macfu.component;

import cn.hutool.json.JSONUtil;
import com.macfu.common.api.Result;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author macfu
 * @description: 当未登录或者token失效访问接口时，自定义的返回结果
 * @date 2019/5/16
 */
@Component
public class RestfulAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        httpServletResponse.getWriter().println(JSONUtil.parse(Result.unauthorized(e.getMessage())));
        httpServletResponse.getWriter().flush();
    }
}
