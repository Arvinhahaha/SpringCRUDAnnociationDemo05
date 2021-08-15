package cn.edu.hebuee.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Classname SpringConfig
 * @Description 配置类和bean.xml作用一致
 * @Date 2021/8/15 11:54
 * @Created by 杨军望
 * Configration 指定当前类是一个配置类
 * ComponentScan 用于通过注解指定spring创建容器时要扫描的包
 */
@Configuration
@ComponentScan(basePackages = "cn.edu.hebuee")
public class SpringConfiguration {
    /**
      *
      * @Description id 返回值放到ioc容器
      * @param [dataSource]
      * @return org.apache.commons.dbutils.QueryRunner
      * @date 2021/8/15 12:06
      * @auther 杨军望
      */
    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean(name = "dataSource")
    public DataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/db2?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8");
        ds.setUser("root");
        ds.setPassword("");
        return ds;
    }
}
