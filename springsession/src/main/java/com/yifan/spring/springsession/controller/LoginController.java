package com.yifan.spring.springsession.controller;

import com.yifan.spring.springsession.entity.ReturnData;
import com.yifan.spring.springsession.entity.StatusCode;
import com.yifan.spring.springsession.entity.User;
import com.yifan.spring.springsession.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/api/user")
public class LoginController
{
    @Bean
    private UserService userService(){
        return  new UserService();
    }

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/login")
    public ReturnData login(HttpServletRequest request, String account, String password)
    {
        User user = userService().findUserByAccountAndPassword(account, password);
        if (user != null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("loginUserId", user.getUserId());
            redisTemplate.opsForValue().set("loginUser:" + user.getUserId(), session.getId());

            return new ReturnData(StatusCode.REQUEST_SUCCESS, user, "登录成功！");
        }
        else
        {
            return new ReturnData(StatusCode.ACCOUNT_OR_PASSWORD_ERROR, null, "账户名或密码错误！");
//            throw new MyException(StatusCode.ACCOUNT_OR_PASSWORD_ERROR, "账户名或密码错误！");
        }
    }

    @RequestMapping(value = "/getUserInfo")
    public ReturnData get(int userId)
    {
        User user = userService().findUserByUserId(userId);
        if (user != null)
        {
            return new ReturnData(StatusCode.REQUEST_SUCCESS, user, "查询成功！");
        }
        else
        {
            return new ReturnData(StatusCode.USER_NOT_EXIST, null,"用户不存在！");
        }
    }

}
