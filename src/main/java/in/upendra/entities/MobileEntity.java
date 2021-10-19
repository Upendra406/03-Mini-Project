package in.upendra.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "MOBILE_STORE")
public class MobileEntity {
	
	@Id
	@Column(name = "MOBILE_ID")
	private Integer id;
	
	@Column(name = "MOBILE_NAME")
	private String name;
	
	@Column(name = "MOBILE_BRAND")
	private String brand;
	
	@Column(name = "MOBILE_RAM")
	private Integer ram;
	
	@Column(name = "MOBILE_PRICE")
	private Double price;

}
