package dev;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DatabaseConfig.class)
public class propertyTest {
	
	@Autowired
	private Database database;
	
	@Test
	public void testPropertyTest(){
		System.out.println(database.getPassword());
		System.out.println(database.getUrl());
		System.out.println(database.getUser());
	}
}
