/**
 * 
 */
package csci4380.finalp.dogs.mongodb.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import csci4380.finalp.dogs.mongodb.model.Dog;

/**
 * @author User
 *
 */
@Repository
public interface DogRepository extends MongoRepository<Dog, String> {

	public Optional<List<Dog>> findByPetId(Integer petId);

	public void deleteByPetId(Integer petId);
	

	public List<Dog> findByNameOrOwnerName(String name, String ownerName);
	
	@Query("{'type': ?0}")
	public List<Dog> findByTypeIgnoreCase(String type);

}
