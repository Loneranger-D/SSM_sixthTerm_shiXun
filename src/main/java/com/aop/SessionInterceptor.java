package com.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * ������,�û������û�������,���ڿ����û�,������session���ܵ�¼
 * @author 86157
 *
 */
public class SessionInterceptor extends HandlerInterceptorAdapter{
	/**
	 * handler �������,���Եõ����õķ����������Ϣ
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		//û��session,��ת����¼ҳ
		if(request.getSession().getAttribute("session_user")==null) {
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
			return false;
		}
		else {
			return true;
		}
	}
	
}
