package dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import dao.model.Country;

@Repository
public interface CountryMapper {
	
	List<Country> selectAll();
	
	Country selectCountryByCountryCodeAndCountryStatus(@Param("countryCode") String countryCode,@Param("countryStatus") Integer countryStatus); 
}
