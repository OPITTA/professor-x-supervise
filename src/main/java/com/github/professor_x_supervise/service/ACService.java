/**
 * 欢迎浏览和修改代码，有任何想法可以email我
 */
package com.github.professor_x_supervise.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 *
 * @author 510655387@qq.com
 */
@Service
public class ACService implements ApplicationContextAware {

    private static ApplicationContext ac;

    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        ACService.ac = ac;
    }

    public <T> T getBean(Class<T> clazz) {
        return ACService.ac.getBean(clazz);
    }

    public Object getBean(String name) {
        return ACService.ac.getBean(name);
    }
}
