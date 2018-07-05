package com.ty.cloud.productservice.infrastructure;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;

@RefreshScope
@Configurable
public class Datasource {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @Bean(name = "mysqlDataSource")
    public DruidDataSource mysqlDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        //DatabaseDriver databaseDriver = DatabaseDriver
        //        .fromJdbcUrl(url);
        //String validationQuery = databaseDriver.getValidationQuery();
        //if (validationQuery != null) {
        //    dataSource.setTestOnBorrow(true);
        //    dataSource.setValidationQuery(validationQuery);
        //}
        //try {
        //    //开启Druid的监控统计功能，mergeStat代替stat表示sql合并,wall表示防御SQL注入攻击
        //    dataSource.setFilters("mergeStat,wall,log4j");
        //} catch (SQLException e) {
        //    // TODO Auto-generated catch block
        //    e.printStackTrace();
        //}
        return dataSource;
    }
}
