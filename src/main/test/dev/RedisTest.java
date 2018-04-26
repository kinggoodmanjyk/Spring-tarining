package dev;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DatabaseConfig.class)
public class RedisTest {

	@Autowired
	private RedisTemplate<String,Object> redisTemplate;

//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private JedisConnectionFactory jedisConnectionFactory;
	
	@Test
	public void test() {
		System.out.println(jedisConnectionFactory.getUsePool());
		System.out.println(jedisConnectionFactory.getPoolConfig());
		System.out.println(jedisConnectionFactory.get);
		redisTemplate.opsForValue().set("a", "a");
//		stringRedisTemplate.opsForValue().set("b", "b");
	}
}
