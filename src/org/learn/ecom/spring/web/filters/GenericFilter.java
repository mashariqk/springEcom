package org.learn.ecom.spring.web.filters;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.learn.ecom.spring.services.GenericRequestHandlerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 273041 on 11/23/2016.
 */
@WebFilter(filterName = "GenericFilter")
public class GenericFilter implements Filter {

    @Autowired
    private GenericRequestHandlerService genericRequestHandlerService;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Request URL intercepted is: "+ ((HttpServletRequest)req).getRequestURI()+ " From IP "+req.getRemoteAddr());
        if(!genericRequestHandlerService.isSiteViewAllowed("")){
            ((HttpServletResponse)resp).sendRedirect("/denied");
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
