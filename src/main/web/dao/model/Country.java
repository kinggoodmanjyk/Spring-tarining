package dao.model;

public class Country {
	private Long id;
	private String countryName;
	private String countryCode;
	private Integer countryStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Integer getCountryStatus() {
		return countryStatus;
	}

	public void setCountryStatus(Integer countryStatus) {
		this.countryStatus = countryStatus;
	}
}
