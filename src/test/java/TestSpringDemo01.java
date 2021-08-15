
import cn.edu.hebuee.config.SpringConfiguration;
import cn.edu.hebuee.domain.Account;
import cn.edu.hebuee.service.IAccountService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Random;

/**
 * @Classname TestSpringDemo01
 * @Description TODO
 * @Date 2021/8/14 23:27
 * @Created by 杨军望
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class TestSpringDemo01 {

   /* ApplicationContext ac ;
    IAccountService as;
    @Before
    public void init(){
        //得到业务层对象
        /*ClassPathXmlApplicationContext("bean.xml");*//*
        ac = new AnnotationConfigApplicationContext(JdbcConfig.class);
        as = ac.getBean("accountService",IAccountService.class);
    }*/

    @Autowired
    private IAccountService as ;

    @Test
    public void testfindll() {
        List<Account> accounts = as.findAllAcount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testfindOne() {
        Account account = as.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void testSave() {
        Account account = new Account(null,"杨军望"+new Random().nextInt(5000),5000.0f);
        as.saveAccount(account);
    }
    @Test
    public void testUpdate() {
        Account account = new Account(null,"杨军望"+new Random().nextInt(5000),5000.0f);
        account.setId(4);
        as.updateAccount(account);
    }
    @Test
    public void testDelete() {
        as.deleteAccount(4);
    }
}
