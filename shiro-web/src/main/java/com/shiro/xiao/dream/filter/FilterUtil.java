package com.shiro.xiao.dream.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterUtil implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        System.out.println("过滤器Filter初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        if (!(request instanceof HttpServletRequest) || !(response instanceof HttpServletResponse)) {
            throw new ServletException("FilterUtil just supports HTTP requests");
        }
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpRequest.setCharacterEncoding(this.filterConfig.getInitParameter("encoding"));
        httpResponse.setCharacterEncoding(this.filterConfig.getInitParameter("encoding"));
        chain.doFilter(httpRequest, httpResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器Filter销毁");
    }

}
