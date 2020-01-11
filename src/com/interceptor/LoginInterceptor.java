package com.interceptor;

import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.pojo.User;

public class LoginInterceptor implements HandlerInterceptor  {

    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("拦截器测试:");
        HttpSession session = request.getSession();
        String contextPath=session.getServletContext().getContextPath();
        String[] noNeedAuthPage = new String[]{
                "login",
                "loginPage",
                "registerPage",
                "UserNameAjax",
                "UserPhoneAjax",
                "forehome",
                "error"
        };

        String uri = request.getRequestURI();
        System.out.println("uri:" + uri);
        uri = StringUtils.remove(uri, contextPath);
        System.out.println("contextPath:" + contextPath);
        System.out.println("removeUri:" + uri);
        String method = StringUtils.substringAfterLast(uri, "/");
        System.out.println("method:" + method);
            if(!Arrays.asList(noNeedAuthPage).contains(method)){
                User user =(User) session.getAttribute("user");
                if(null==user){
                    response.sendRedirect("/RentalMe/loginPage");
                    System.out.println("111login");
                    return false;
                }
            }
            System.out.println("pass");
        return true;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

    

} 
    

