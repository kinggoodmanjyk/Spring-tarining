package dev;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.mapper.CountryMapper;
import dao.model.Country;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DatabaseConfig.class)
public class MyBatisTest {
//
//	@Autowired
//	private SqlSessionTemplate sqlSessionTemplate;

	@Autowired
	private CountryMapper countryMapper;

	@Test
	public void test() {
		Country country = countryMapper
				.selectCountryByCountryCodeAndCountryStatus("CN", 1);
		System.out.printf("%-4d%4s%4s\n", country.getId(),
				country.getCountryName(), country.getCountryCode());
	}

}
