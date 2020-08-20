package com.aninda.practice.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
	private final Object target;
	private Map<String, Integer> calls = new HashMap<>();
	
	public LoggingHandler(Object target) {
		super();
		this.target = target;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T withLogging(T target, Class<T> itf) {
	    return (T) Proxy.newProxyInstance(
	      itf.getClassLoader(),
	      new Class<?>[] { itf },
	      new LoggingHandler(target));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		String name = method.getName();

	    if (name.contains("toString"))
	    {
	      return calls.toString();
	    }

	    // add or increment number of calls
	    calls.merge(name, 1, Integer::sum);
	    return method.invoke(target, args);
	}

}
