package dev;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource(value = "classpath:/dev/application.properties")
public class DatabaseConfig {

	@Autowired
	Environment env;

	@Bean
	public DruidDataSource getDataSource() throws SQLException {
		DruidDataSource ds = new DruidDataSource();
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/shiro?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true&useSSL=false");
		ds.setUsername("root");
		ds.setPassword("64388515");
		
		//配置连接池初始化
		ds.setInitialSize(1);//初始大小
		ds.setMinIdle(1);//最小闲置
		ds.setMaxActive(20);//最大活跃
		ds.setMaxWait(60000);//等待超时的时间
		ds.setTimeBetweenEvictionRunsMillis(60000);//配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
		ds.setMinEvictableIdleTimeMillis(300000);//配置一个连接在池中最小生存的时间，单位是毫秒
		
		ds.setValidationQuery("SELECT 'x'");//检测创建的链接是否可用
		ds.setTestWhileIdle(true);
		ds.setTestOnBorrow(false);
		ds.setTestOnReturn(false);
		
		//打开PSCache，并且指定每个连接上PSCache的大小
		ds.setPoolPreparedStatements(true);
		ds.setMaxPoolPreparedStatementPerConnectionSize(20);
		
		//配置监控统计拦截的filters，去掉后监控界面sql无法统计
		ds.setFilters("stat");
		return ds;
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(getDatebase());
		sessionFactory.setTypeAliasesPackage("com.huang.domain");
		sessionFactory
				.setMapperLocations(new PathMatchingResourcePatternResolver()
						.getResources("classpath:mapper/*.xml"));
		return sessionFactory;
	}

}
