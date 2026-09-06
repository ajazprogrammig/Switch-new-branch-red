package __AssociationMappin.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer addId;
	
private String City;

private String state;

private String country;

@ManyToOne
@JoinColumn(name = "emp_id")
private Employee employee;

public Integer getAddId() {
	return addId;
}

public void setAddId(Integer addId) {
	this.addId = addId;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

public Address(Integer addId, String city, String state, String country, Employee employee) {
	super();
	this.addId = addId;
	City = city;
	this.state = state;
	this.country = country;
	this.employee = employee;
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Address [addId=" + addId + ", City=" + City + ", state=" + state + ", country=" + country + ", employee="
			+ employee + "]";
}



}
