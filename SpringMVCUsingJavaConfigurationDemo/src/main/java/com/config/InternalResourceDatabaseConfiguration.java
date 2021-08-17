package com.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages="com")
@EnableTransactionManagement
@Configuration
public class InternalResourceDatabaseConfiguration {
@Bean
public InternalResourceViewResolver viewResolver()
{//id method name before method class
	InternalResourceViewResolver irvr=new InternalResourceViewResolver();
	irvr.setPrefix("/WEB-INF/JSP/");
	irvr.setSuffix(".jsp");
	return irvr;
}
@Bean
public DriverManagerDataSource dataSource()
{
	DriverManagerDataSource dmds=new DriverManagerDataSource();
	dmds.setUsername("root");
	dmds.setPassword("root");
	dmds.setUrl("jdbc:mysql://localhost:3306/jdbctemplatedemo");
	dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	return dmds;
}
@Bean
public LocalSessionFactoryBean sessionFactory()
{
	LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
	lsfb.setDataSource(dataSource());
	lsfb.setPackagesToScan(new String[] { "com.model" });//to get pojo class attributes
	lsfb.setHibernateProperties(hibernateProperties());
	return lsfb;
}
private Properties hibernateProperties()
{
	Properties properties=new Properties();
	properties.put("hibernate.dialect", "org.hibernate.dialect.MYSQLDialect");
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.format_sql", "true");
	properties.put("hibernate.hbm2ddl.auto", "update");
	return properties;
}

@Bean
public  HibernateTransactionManager transactionManager()
{
	HibernateTransactionManager htm=new HibernateTransactionManager();
	htm.setSessionFactory(sessionFactory().getObject());
	return htm;
}
}
