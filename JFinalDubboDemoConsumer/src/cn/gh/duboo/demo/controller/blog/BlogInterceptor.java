package cn.gh.duboo.demo.controller.blog;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

/**
 * BlogInterceptor
 */
public class BlogInterceptor implements Interceptor {
	
	public void intercept(ActionInvocation ai) {
		System.out.println("Before invoking " + ai.getActionKey());
		ai.invoke();
		System.out.println("After invoking 1111" + ai.getActionKey());
	}
}
