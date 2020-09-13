package com.aloogn.common.interceptor;

import com.aloogn.common.utils.Constant;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.common.utils.TokenUtil;
import com.aloogn.fs.redis.service.RedisService;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Configuration

public class LoginInterceptor implements HandlerInterceptor {

    private static Logger log = LoggerFactory.getLogger(LoginInterceptor.class);

    @Autowired
    private RedisService redisService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

//        //获取请求的RUi:去除http:localhost:8080这部分剩下的
//        String uri = request.getRequestURI();
//        //UTL:除了login.jsp是可以公开访问的，其他的URL都进行拦截控制
//        if (uri.equals("/user/signIn")) {
//            return true;
//        }
//        //获取session
//        HttpSession session = request.getSession();
//        User user = (User) session.getAttribute("USER_SESSION");
//
//        //判断session中是否有用户数据，如果有，则返回true，继续向下执行
//        if (user != null) {
//            return true;
//        }
//
//        //不符合条件的给出提示信息，并转发到登录页面
//        request.setAttribute("msg", "您还没有登录，请先登录！");
////        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

        //获取请求api
        String servletPath = request.getServletPath();
        String token = request.getHeader("token");

        //白名单
        if(StringUtils.isWhiteList(servletPath)){
            return true;
        }

        try {
            /* 解析token */
            Map<String, Object> validMap = TokenUtil.valid(token);
            Integer i = (Integer) validMap.get("Result");
            if (i == 0) {
                JSONObject jsonObject = (JSONObject) validMap.get("data");
                log.debug("jsonObject----->"+jsonObject.toJSONString());

                //解析携带的token载体中的id
                String account = (String) jsonObject.get("account");
                //获取存入缓存中的token,每次登录就添加，登出就删除，更改密码或其它就替换
//                String rToken = (String)redisService.hashGet(Constant.REDIS_TOKEN_KEY, account);
//                if(!token.equals(rToken)) {
//                    loginError(response,"帐户己在其它地方登录，你己被迫下线");
//                }

                return true;
            } else if (i == 2) {//token已经过期
                log.debug("--------token已经过期------");
                loginError(response,"会话已经过期，请重新登录");
            }else {
                log.debug("--------token错误------");
                loginError(response,"会话错误");
            }

        } catch (Exception e) {
            e.printStackTrace();
            log.debug("--------未知错误------"+e.getCause().getMessage());
        }

        return false;
    }

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

	}

    private void loginError(HttpServletResponse response,String msg) throws IOException {
        JSONObject res = new JSONObject();
        res.put("code", Constant.SESSION_CODE_ERROR);
        res.put("msg",msg);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(res.toString());
            out.flush();
        } catch (IOException e) {
            response.sendError(500);
        }finally {
            if(out != null) {
                out.close();
            }
        }

    }
}