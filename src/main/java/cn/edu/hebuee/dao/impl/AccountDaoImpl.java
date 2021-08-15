package cn.edu.hebuee.dao.impl;

import cn.edu.hebuee.dao.IAccountDao;
import cn.edu.hebuee.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname AccountDaoImpl
 * @Description TODO
 * @Date 2021/8/14 21:01
 * @Created by 杨军望
 */

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private QueryRunner runner;

   

    @Override
    public List<Account> findAllAcount() {
        try {
            return runner.query("select * from account",
                    new BeanListHandler<Account>(Account.class));
        } catch (SQLException throwables) {
           throw new RuntimeException(throwables);
        }
    }

    @Override
    public Account findAccountById(Integer id) {
        try {
            return runner.query("select * from account where id = ?",
                    new BeanHandler<Account>(Account.class),id);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public void saveAccount(Account account) {
        try {
            runner.update("insert into account (name,money)values (?,?)"
                    ,account.getName(),account.getMoney());
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
           runner.update("update account set name = ?,money =? where id = ?"
                    ,account.getName(),account.getMoney(),account.getId());
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    public void deleteAccount(Integer accountId) {
        try {
            runner.update("delete from account where id = ?",accountId);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
}
