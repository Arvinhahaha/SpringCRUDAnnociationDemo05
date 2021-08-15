package cn.edu.hebuee.service.impl;

import cn.edu.hebuee.dao.IAccountDao;
import cn.edu.hebuee.dao.impl.AccountDaoImpl;
import cn.edu.hebuee.domain.Account;
import cn.edu.hebuee.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname IAccountServiceImpl
 * @Description 账户的业务层实现类
 * @Date 2021/8/14 20:48
 * @Created by 杨军望
 */

@Service("accountService")
public class IAccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

//    public IAccountServiceImpl(IAccountDao accountDao) {
//        this.accountDao = accountDao;
//    }
//
//    public IAccountServiceImpl() {
//    }

    /**
     * @return java.util.List<cn.edu.hebuee.domain.Account>
     * @Description 查找全部
     * @date 2021/8/14 20:39
     * @auther 杨军望
     */
    @Override
    public List<Account> findAllAcount() {
        return accountDao.findAllAcount();
    }

    /**
     * @return
     * @Description 查找一个
     * @date 2021/8/14 20:40
     * @auther 杨军望
     */
    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    /**
     * @param account
     * @return void
     * @Description 保存操作
     * @date 2021/8/14 20:43
     * @auther 杨军望
     */
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    /**
     * @param account
     * @return void
     * @Description 更新操作
     * @date 2021/8/14 20:44
     * @auther 杨军望
     */
    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    /**
     * @param accountId
     * @return void
     * @Description 通过id删除
     * @date 2021/8/14 20:44
     * @auther 杨军望
     */
    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }
}
