package com.example9.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FestivalDiscountReplacer implements MethodReplacer
{

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable 
    {
        double amount=(double)args[0];
        return amount*0.20;
    }
    
}
