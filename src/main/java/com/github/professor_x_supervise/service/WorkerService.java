/**
 * 欢迎浏览和修改代码，有任何想法可以email我
 */
package com.github.professor_x_supervise.service;

/**
 *
 * @author 510655387@qq.com
 */
public interface WorkerService {

    String exec(String command, String[] args);

    String status(String sessionId);

}
