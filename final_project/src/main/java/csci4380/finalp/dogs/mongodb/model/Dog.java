/**
 * 
 */
package csci4380.finalp.dogs.mongodb.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author Charles
 *
 */
@Document(collection="Dog")
public class Dog {
	public String getId() {
		return id;
	}
	public Integer getPetId() {
		return petId;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public boolean isSpayed() {
		return isSpayed;
	}
	public String getBirthDate()
	{
		return birthdate;
	}

	@Id
	private String id;	// NOTE charles this is mongodb specific "objectId"
	private Integer petId;
	@Indexed(direction=IndexDirection.ASCENDING)
	private String name;
	private String type;
	private String ownerName;
	private String address;
	private int age;
	private boolean isSpayed;
	private String birthdate;
	
	public Dog() {}
	
	public Dog(Integer petId, String name, String type, String ownerName, String address, int age, boolean isSpayed, String birthdate) {
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
		return "Dog [petId=" + petId + ", name=" + name + ", type=" + type + ", ownerName=" + ownerName + ", address="
				+ address + ", age=" + age + ", isSpayed=" + isSpayed + ", birthdate=" + birthdate + "]";
	}
}

