package com.apress.prospring4.ch5;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 16:46
 * Declaration: All Rights Reserved !!!
 */
public class SimpleBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before method: " + method);
    }
}
