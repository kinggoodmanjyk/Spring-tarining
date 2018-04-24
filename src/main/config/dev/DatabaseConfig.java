package dev;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource(value = "classpath:/application.properties")
public class DatabaseConfig {

	@Autowired
	Environment env;

	@Bean
	public DruidDataSource getDataSource() throws SQLException {
		DruidDataSource ds = new DruidDataSource();
		ds.setUrl(env.getProperty("db.master.url"));
		ds.setUsername(env.getProperty("db.master.user"));
		ds.setPassword(env.getProperty("db.master.password"));

		// 配置连接池初始化
		ds.setInitialSize(1);// 初始大小
		ds.setMinIdle(1);// 最小闲置
		ds.setMaxActive(20);// 最大活跃
		ds.setMaxWait(60000);// 等待超时的时间
		ds.setTimeBetweenEvictionRunsMillis(60000);// 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
		ds.setMinEvictableIdleTimeMillis(300000);// 配置一个连接在池中最小生存的时间，单位是毫秒

		ds.setValidationQuery("SELECT 'x'");// 检测创建的链接是否可用
		ds.setTestWhileIdle(true);
		ds.setTestOnBorrow(false);
		ds.setTestOnReturn(false);

		// 打开PSCache，并且指定每个连接上PSCache的大小
		ds.setPoolPreparedStatements(true);
		ds.setMaxPoolPreparedStatementPerConnectionSize(20);

		// 配置监控统计拦截的filters，去掉后监控界面sql无法统计
		ds.setFilters("stat");
		return ds;
	}

	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactoryBean getSqlSessionFactoryBean() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybaits-config.xml"));
		sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:dao/mapper/**.xml"));
		sessionFactory.setDataSource(getDataSource());
		return sessionFactory;
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate() throws Exception{
		SqlSessionFactoryBean factoryBean  = getSqlSessionFactoryBean();
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(factoryBean.getObject());
		return sqlSessionTemplate;
	}
	
	
//	@Bean(name = "sqlClient")
//	public MapperScannerConfigurer mapperScannerConfigurer() throws Exception{
//		MapperScannerConfigurer msc = new MapperScannerConfigurer();
//		msc.set
//	}
}
