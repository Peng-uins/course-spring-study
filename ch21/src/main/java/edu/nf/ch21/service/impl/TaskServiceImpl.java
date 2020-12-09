package edu.nf.ch21.service.impl;

import edu.nf.ch21.service.TaskService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author 0.0
 * @date 2020/12/9
 */
@Service("serviceImpl")
public class TaskServiceImpl implements TaskService {

    /**
     * Thread获取线程
     * Thread.currentThread()获取当前正在执行的线程
     */
    @Override
    public void backup() {
        System.out.println(Thread.currentThread().getName() + "执行备份");
    }

    @Override
    public void clean() {
        System.out.println(Thread.currentThread().getName() + "执行清理");
    }

}