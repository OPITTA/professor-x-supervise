/**
 * 欢迎浏览和修改代码，有任何想法可以email我
 */
package com.github.professor_x_supervise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 510655387@qq.com
 */
public class ProfessorXSupervise {

    private static final Logger logger = LoggerFactory.getLogger(ProfessorXSupervise.class);

    public static void main(String... args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:motan_server.xml");
        ac.start();
        logger.info("server start...");
    }
}
