package com.KarlexYan.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

// 配置MyBatis作Bean 替代mybatis-config.xml
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
//        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
//        // 代替<typeAliases>中的<package>标签
//        ssfb.setTypeAliasesPackage("com.KarlexYan.domain");
//        // 代替<dataSource>标签
//        ssfb.setDataSource(dataSource);
//        return ssfb;
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.KarlexYan.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        // 代替<mappers>的<package>标签
        msc.setBasePackage("com.KarlexYan.dao");
        return msc;
    }
}
