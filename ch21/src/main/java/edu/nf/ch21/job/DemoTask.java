package edu.nf.ch21.job;

import edu.nf.ch21.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.ws.Action;

/**
 * @author 0.0
 * @date 2020/12/9
 * 定时任务
 */
@Component
public class DemoTask {

    @Autowired
    private TaskService taskService;

    /**
     * 定时任务需要反复执行TaskService业务逻辑，
     * 因此将他注入进来
     * @param taskService
     *//*
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }*/

    /**
     * 定时备份
     */
    @Scheduled(cron = "0/3 * * * * ?")
    public void executeBackup(){
        taskService.backup();
    }

    /**
     * 定时清理
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void executeClean(){
        taskService.clean();
    }
}