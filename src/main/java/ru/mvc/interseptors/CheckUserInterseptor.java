package ru.mvc.interseptors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ru.mvc.objects.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckUserInterseptor extends HandlerInterceptorAdapter {

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler, ModelAndView modelAndView)
            throws Exception {
        if(request.getRequestURI().contains("checkUser")){
            User user=(User) modelAndView.getModel().get("user");
            if(!user.isAdmin()){
                response.sendRedirect(request.getContextPath()
                +"/loginFailed");
            }
        }
    }
}
