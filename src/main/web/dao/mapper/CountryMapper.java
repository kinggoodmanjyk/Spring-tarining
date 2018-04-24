package dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.model.Country;

public interface CountryMapper {
	
	List<Country> selectAll();
	
	Country selectCountryByCountryCodeAndCountryStatus(String countryCode, Integer countryStatus); 
}
