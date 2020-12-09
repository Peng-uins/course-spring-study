package edu.nf.ch20.job;

import edu.nf.ch20.service.TaskService;

/**
 * @author 0.0
 * @date 2020/12/9
 * 定时任务
 */
public class DemoTask {

    private TaskService taskService;

    /**
     * 定时任务需要反复执行TaskService业务逻辑，
     * 因此将他注入进来
     * @param taskService
     */
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * 定时备份
     */
    public void executeBackup(){
        taskService.backup();
    }

    /**
     * 定时清理
     */
    public void executeClean(){
        taskService.clean();
    }
}