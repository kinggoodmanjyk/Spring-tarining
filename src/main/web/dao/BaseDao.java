package dao;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class BaseDao {
	
	@Bean
	public LocalSessionFactoryBean sessionFactory5Xml(DataSource dataSource){
		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
		sfb.setDataSource(dataSource);
		sfb.setMappingResources(new String[] {"training.hbm.xml"});
		Properties props = new Properties();
		props.setProperty("dialect", "org.hibernate.dialect.H2Dialect");
		sfb.setHibernateProperties(props);
		return sfb;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory5Annotation(DataSource dataSource){
		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
		sfb.setDataSource(dataSource);
		sfb.setPackagesToScan(new String[] {"habuma.spittr.domain"});
		Properties props = new Properties();
		props.setProperty("dialect", "org.hibernate.dialect.H2Dialect");
		sfb.setHibernateProperties(props);
		return sfb;
	}
}
