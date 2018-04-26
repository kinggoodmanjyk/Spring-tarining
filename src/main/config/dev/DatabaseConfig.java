package dev;

import java.sql.SQLException;


import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import redis.clients.jedis.JedisPoolConfig;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
// @PropertySource(value = "classpath:/application.properties")
public class DatabaseConfig {

	// @Autowired
	// Environment env;

	// ------------------------------------DateSource-------------------------------
	@Bean
	public DruidDataSource getDataSource() throws SQLException {
		System.out.println("getDataSource");
		DruidDataSource ds = new DruidDataSource();
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/go?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT%2B8&transformedBitIsBoolean=true&useSSL=false");
		ds.setUsername("root");
		ds.setPassword("64388515");

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

	// ------------------------------------Mybaties-------------------------------
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactoryBean getSqlSessionFactoryBean() throws Exception {
		System.out.println("getSqlSessionFactoryBean");
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory
				.setConfigLocation(new PathMatchingResourcePatternResolver()
						.getResource("classpath:mybaits-config.xml"));
		sessionFactory
				.setMapperLocations(new PathMatchingResourcePatternResolver()
						.getResources("classpath:dao/mapper/**.xml"));
		sessionFactory.setDataSource(getDataSource());
		return sessionFactory;
	}

	// @Bean(name = "sqlSessionTemplate")
	// public SqlSessionTemplate sqlSessionTemplate() throws Exception{
	// SqlSessionFactoryBean factoryBean = getSqlSessionFactoryBean();
	// SqlSessionTemplate sqlSessionTemplate = new
	// SqlSessionTemplate(factoryBean.getObject());
	// return sqlSessionTemplate;
	// }

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer msc = new MapperScannerConfigurer();
		msc.setBasePackage("dao");
		msc.setSqlSessionFactoryBeanName("sqlSessionFactory");
		return msc;
	}

	// ------------------------------------Redis-------------------------------

//	@Bean
//	public JedisClientConfiguration getJedisClientConfiguration() {
//		JedisPoolingClientConfigurationBuilder JedisPoolingClientConfigurationBuilder = (JedisPoolingClientConfigurationBuilder) JedisClientConfiguration
//				.builder();
//		GenericObjectPoolConfig GenericObjectPoolConfig = new GenericObjectPoolConfig();
//		GenericObjectPoolConfig.setMaxIdle(1000);
//		GenericObjectPoolConfig.setMaxTotal(100);
//		GenericObjectPoolConfig.setMinIdle(100);
//		return JedisPoolingClientConfigurationBuilder.poolConfig(
//				GenericObjectPoolConfig).build();
//	}

//	@Bean
//	public RedisConnectionFactory getRedisConnectionFactory() {
//		RedisStandaloneConfiguration standaloneConfig = new RedisStandaloneConfiguration();
//		standaloneConfig.setHostName("47.98.189.17");
//		standaloneConfig.setPort(6379);
//		return new JedisConnectionFactory(standaloneConfig,
//				getJedisClientConfiguration());
//	}
	
	@Bean
	public JedisPoolConfig getJedisPoolConfig(){
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxIdle(1000);
		jedisPoolConfig.setMaxTotal(100);
		jedisPoolConfig.setMinIdle(100);
		return jedisPoolConfig;
	}
	
	@Bean
	public JedisConnectionFactory getJedisConnectionFactory() {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		jedisConnectionFactory.setHostName("47.98.189.17");
		jedisConnectionFactory.setPort(6379);
		jedisConnectionFactory.setPoolConfig(getJedisPoolConfig());
		jedisConnectionFactory.setUsePool(true);
//		jedisConnectionFactory.afterPropertiesSet(); //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		jedisConnectionFactory.setUseSsl(true);
		return jedisConnectionFactory;
	}

	@Bean(name = "redisTemplate")
	public RedisTemplate<String, Object> getRedisTemplate() {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashValueSerializer(new JdkSerializationRedisSerializer());
		redisTemplate.setConnectionFactory(getJedisConnectionFactory());
		return redisTemplate;
	}

	@Bean(name = "stringRedisTemplate")
	public StringRedisTemplate getStringRedisTemplate() {
		StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
		stringRedisTemplate.setConnectionFactory(getJedisConnectionFactory());
		return stringRedisTemplate;
	}

}