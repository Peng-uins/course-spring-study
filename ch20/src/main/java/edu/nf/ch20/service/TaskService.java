package edu.nf.ch20.service;

/**
 * @author 0.0
 * 定时任务处理服务
 */
public interface TaskService {

    /**
     * 定时备份
     */
    void backup();

    /**
     * 定时清理
     */
    void clean();
}
