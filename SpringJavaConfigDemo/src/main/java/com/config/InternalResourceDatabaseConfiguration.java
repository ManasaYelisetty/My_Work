package com.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
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
@PropertySource(value = { "classpath:application.properties" })
public class InternalResourceDatabaseConfiguration {
	@Autowired
	private Environment environment;
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
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
    dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
    dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
    dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
    return dataSource;
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


private Properties hibernateProperties() {
	Properties properties = new Properties();
    properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
    properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
    properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
    properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
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
