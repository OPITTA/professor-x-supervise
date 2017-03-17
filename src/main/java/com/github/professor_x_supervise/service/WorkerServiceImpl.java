/**
 * 欢迎浏览和修改代码，有任何想法可以email我
 */
package com.github.professor_x_supervise.service;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author 510655387@qq.com
 */
public class WorkerServiceImpl implements WorkerService {

    private static final Logger logger = LoggerFactory.getLogger(WorkerServiceImpl.class);

    public String exec(String command, String[] args) {
        logger.info("cmd={}, args={}", command, Arrays.toString(args));
        return null;
    }

    public String status(String sessionId) {
        return null;
    }

}
