package com.fineway.springbootdemo.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = "com.fineway.springbootdemo.dao.cnzb_now", sqlSessionTemplateRef  = "test5SqlSessionTemplate")
public class DataSource5Config {
    @Bean(name="test5DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.source5")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "test5SqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("test5DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/fineway/springbootdemo/dao/cnzb_now/sqlmap/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "test5TransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("test5DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "test5SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test5SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
