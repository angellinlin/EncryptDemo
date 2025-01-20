package com.zuiyu.encryptdemo.encry.service;


import com.zuiyu.encryptdemo.encry.bean.Dept;
import com.zuiyu.encryptdemo.encry.bean.InvCusComplaint;
import com.zuiyu.encryptdemo.encry.bean.InvCusEventInfo;
import com.zuiyu.encryptdemo.encry.bean.User;
import com.zuiyu.encryptdemo.encry.dao.DeptMapper;
import com.zuiyu.encryptdemo.encry.dao.InvCusComplaintMapper;
import com.zuiyu.encryptdemo.encry.dao.InvCusEventInfoMapper;
import com.zuiyu.encryptdemo.encry.dao.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

/**
 * @author create by zuiyu,github https://github.com/zuiyu-main
 * @classname TestService
 * @description TODO
 * @date 2024/4/16 10:16
 */
@Service
public class TestService {
    public final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private InvCusComplaintMapper invCusComplaintMapper;
    @Autowired
    private InvCusEventInfoMapper invCusEventInfoMapper;
    @Autowired
    private Test2Service test2Service;
    @Async
    public void test(){
        log.info("TestService 方法执行，执行线程:{}",Thread.currentThread().getName());
        test2();
        InvCusComplaint user = new InvCusComplaint();
        user.setComplaintContent("zuiyu");
        user.setId(189);
        user.setCreatedDate(new Date());
        user.setComplaintFlag("gg");
        user.setComplaintType("gg");
        user.setJdPin("gg");
        user.setOrgName("gg");
        user.setInvestorLoanIds("ggg");
        user.setYn(1);
        user.setOrgId("gg");
        user.setProcessId("gs");
        invCusComplaintMapper.insert(user);

        int a = 22/0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Async
    public void test2(){
        log.info("Test2Service 异步方法执行，执行线程:{}",Thread.currentThread().getName());
        InvCusComplaint user = new InvCusComplaint();
        user.setComplaintContent("zuiyu333333");
        user.setId(183);
        user.setCreatedDate(new Date());
        user.setComplaintFlag("gg");
        user.setComplaintType("gg");
        user.setJdPin("gg");
        user.setOrgName("gg");
        user.setInvestorLoanIds("ggg");
        user.setYn(1);
        user.setOrgId("gg");
        user.setProcessId("gs");
        invCusComplaintMapper.insert(user);
//        InvCusEventInfo dept = new InvCusEventInfo();
//        dept.setId(34L);
//        dept.setAttachment("dept2");
//        dept.setComplaintInfo("gg");
//        dept.setComplaintType("gg");
//        dept.setCreatedTime(new Date());
//        dept.setComplaintSource("gg");
//        dept.setOrgName("gg");
//        invCusEventInfoMapper.insert(dept);
        int a = 22/0;
    }

//    @Bean("zuiyuThreadPool")
//    public Executor zuiyuThreadPool(){
//        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//        threadPoolTaskExecutor.setCorePoolSize(8);
//        threadPoolTaskExecutor.setMaxPoolSize(16);
//        threadPoolTaskExecutor.setQueueCapacity(100);
//        threadPoolTaskExecutor.setKeepAliveSeconds(60);
//        threadPoolTaskExecutor.setThreadNamePrefix("zuiyuThreadPool-");
//        threadPoolTaskExecutor.initialize();
//        return threadPoolTaskExecutor;
//    }

//    @Async("zuiyuThreadPool")
//    public CompletableFuture<String> async(){
//        log.info("异步线程消息输出:{}",Thread.currentThread().getName());
//        return CompletableFuture.completedFuture("zuiyu-java");
//    }
//    @Async("zuiyuThreadPool")
    @Async
    public void async(){
        log.info("异步线程消息输出:{}",Thread.currentThread().getName());
    }
}
