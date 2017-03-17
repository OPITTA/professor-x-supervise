package com.github.professor_x_supervise.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author 510655387@qq.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:motan_client.xml")
public class WorkerServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private ACService acService;

    public WorkerServiceImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of exec method, of class WorkerServiceImpl.
     */
    @Test
    public void testExec() {
        WorkerService workerService = (WorkerService) acService.getBean("workerService");
        workerService.exec("ls", new String[]{"-l"});
    }

    /**
     * Test of status method, of class WorkerServiceImpl.
     */
    @Test
    public void testStatus() {
        WorkerService workerService = (WorkerService) acService.getBean("workerService");
        workerService.status("01");
    }

}
