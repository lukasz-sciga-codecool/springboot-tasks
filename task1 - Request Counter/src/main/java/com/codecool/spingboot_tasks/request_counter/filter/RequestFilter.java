package com.codecool.spingboot_tasks.request_counter.filter;

import com.codecool.spingboot_tasks.request_counter.service.RequestCountStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(1)
public class RequestFilter implements Filter {

    private final RequestCountStatsService service;

    @Autowired
    public RequestFilter(RequestCountStatsService service) {
        this.service = service;
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws ServletException, IOException {
        var request = (HttpServletRequest) servletRequest;
        System.out.println("Before filter");
        request.getHeader("Authentication");
        if (request.getServletPath().contains("api/requests")) {
            service.increaseCounter(request.getMethod());
        }
        filterChain.doFilter(servletRequest, servletResponse);
        var response = (HttpServletResponse) servletResponse;
        System.out.println("After filter");
    }
}
