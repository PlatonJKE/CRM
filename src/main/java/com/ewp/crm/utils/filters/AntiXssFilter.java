package com.ewp.crm.utils.filters;

import org.springframework.stereotype.Component;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Map;

@WebFilter(urlPatterns = "/*")
@Component
public class AntiXssFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter xss init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        Map<String, String[]> parameterMap = servletRequest.getParameterMap();

//        if (userInput != null && !userInput.equalsIgnoreCase(HtmlUtils.htmlEscape(userInput)))
//            throw new RuntimeException();
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("filter xss init");
    }
}
