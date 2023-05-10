package com.example.AOPTest;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopConfig {
    Logger logger = LoggerFactory.getLogger(AopConfig.class);

    @Before("execution(* com.example.AOPTest.ClassA.printHello(..))")
    public void logPrintHello(JoinPoint joinPoint) {
        System.out.println("before Calling method printHello() printing this");
        this.logger.info("-->  " + joinPoint.getSignature().getName());
    }

    //self practice
    @After("execution(* com.example.AOPTest.ClassA.printHello(..))")
    public void logPrintHelloAfter(JoinPoint joinPoint) {
        System.out.println("after Calling method printHello() printing this");
        this.logger.info("-->  " + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.example.AOPTest.ClassA.getNum(..))")
    public void logGetNum(JoinPoint joinPoint) {
        System.out.println("before Calling method getNum() printing this....");
        this.logger.info("-->  " + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.example.AOPTest.ClassA.getSum(..))")
    public void logGetSum(JoinPoint joinPoint) {
        System.out.println("before Calling method getSum() printing this....");
        this.logger.info("-->  " + joinPoint.getSignature().getName());
    }

}


// some other annotation


//this.logger.info("**** Staring - " + joinPoint.getSignature().getName());
//this.logger.info("**** With parameter - " + Arrays.toString(joinPoint.getArgs()));

//    @After("execution(* com.example.AOPTest.ClassA.*(..))")
//    public void after(JoinPoint joinPoint) {
//        this.logger.info("**** Finished - " + joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(
//            value = "execution(* com.example.AOPTest.ClassA.*(..))",
//            returning = "result"
//    )
//    public void after(JoinPoint joinPoint, Object result) {
//        this.logger.info("**** Finished - " + joinPoint.getSignature().getName());
//        this.logger.info("**** Returned - " + result);
//    }

