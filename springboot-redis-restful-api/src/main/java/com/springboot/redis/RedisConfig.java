package com.springboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;*/

import com.springboot.pojo.RedisConfigBean;
import com.springboot.pojo.User;

@Configuration
public class RedisConfig {

	/*
	 * @Autowired private RedisConfigBean redisConfigBean;
	 * 
	 *//**
		 * 使用Lettuce连接Redis
		 * 
		 * @return
		 */
	/*
	 * @Bean public LettuceConnectionFactory connectionFactory() {
	 * LettuceConnectionFactory lettuceConnectionFactory = new
	 * LettuceConnectionFactory();
	 * lettuceConnectionFactory.setDatabase(redisConfigBean.getDatabase());
	 * lettuceConnectionFactory.setHostName(redisConfigBean.getHost());
	 * lettuceConnectionFactory.setPassword(redisConfigBean.getPassword());
	 * lettuceConnectionFactory.setPort(redisConfigBean.getPort());
	 * 
	 * return lettuceConnectionFactory; }
	 * 
	 * @Bean public RedisTemplate<String, User> redisTemplate() {
	 * RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
	 * redisTemplate.setKeySerializer(new StringRedisSerializer());
	 * redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
	 * redisTemplate.setConnectionFactory(connectionFactory()); return
	 * redisTemplate; }
	 * 
	 * @Bean public HashOperations hashOperations() { return
	 * redisTemplate().opsForHash(); }
	 */}
