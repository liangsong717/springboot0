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
@MapperScan(basePackages = "com.fineway.springbootdemo.dao.cnzb_kingbase", sqlSessionTemplateRef  = "test4SqlSessionTemplate")
public class DataSource4Config {
    @Bean(name="test4DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.source4")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "test4SqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("test4DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/fineway/springbootdemo/dao/cnzb_kingbase/sqlmap/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "test4TransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("test4DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "test4SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test4SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
