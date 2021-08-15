package cn.edu.hebuee.dao;

import cn.edu.hebuee.domain.Account;

import java.util.List;

/**
 * @Classname IAccountDao
 * @Description TODO
 * @Date 2021/8/14 20:51
 * @Created by 杨军望
 */
public interface IAccountDao {
        /**
         *
         * @Description 查找全部
         * @param []
         * @return java.util.List<cn.edu.hebuee.domain.Account>
         * @date 2021/8/14 20:39
         * @auther 杨军望
         */
        List<Account> findAllAcount();

        /**
         *
         * @Description 查找一个
         * @param
         * @return
         * @date 2021/8/14 20:40
         * @auther 杨军望
         */
        Account findAccountById(Integer id);

        /**
         *
         * @Description 保存操作
         * @param [account]
         * @return void
         * @date 2021/8/14 20:43
         * @auther 杨军望
         */
        void saveAccount(Account account);

        /**
         *
         * @Description 更新操作
         * @param [account]
         * @return void
         * @date 2021/8/14 20:44
         * @auther 杨军望
         */
        void updateAccount(Account account);

        /**
         *
         * @Description 通过id删除
         * @param [account]
         * @return void
         * @date 2021/8/14 20:44
         * @auther 杨军望
         */
        void deleteAccount(Integer accountId);
}
