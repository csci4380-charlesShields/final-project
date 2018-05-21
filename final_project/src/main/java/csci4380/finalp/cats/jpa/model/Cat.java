/**
 * 
 */
package csci4380.finalp.cats.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Charles
 *
 */
@Entity(name="CAT")
public class Cat {
	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsSpayed() {
		return isSpayed;
	}

	public void setIsSpayed(Boolean isSpayed) {
		this.isSpayed = isSpayed;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Id
	@GeneratedValue
	private Integer petId;
	private String name;
	private String type;
	private String ownerName;
	private String address;
	private Integer age;
	private Boolean isSpayed;
	private String birthdate;


	public Cat(){}
	
	

	public Cat(String name, String type, String ownerName, String address, Integer age, Boolean isSpayed,
			String birthdate) {
		super();
		this.name = name;
		this.type = type;
		this.ownerName = ownerName;
		this.address = address;
		this.age = age;
		this.isSpayed = isSpayed;
		this.birthdate = birthdate;
	}

	public Cat(Integer petId, String name, String type, String ownerName, String address, Integer age, Boolean isSpayed,
			String birthdate) {
		super();
		this.petId = petId;
		this.name = name;
		this.type = type;
		this.ownerName = ownerName;
		this.address = address;
		this.age = age;
		this.isSpayed = isSpayed;
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Cat [petId=" + petId + ", name=" + name + ", type=" + type + ", ownerName=" + ownerName + ", address="
				+ address + ", age=" + age + ", isSpayed=" + isSpayed + ", birthdate=" + birthdate + "]";
	}
}
	
	
	
	

