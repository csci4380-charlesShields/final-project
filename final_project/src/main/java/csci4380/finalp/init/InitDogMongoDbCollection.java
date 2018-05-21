/**
 * 
 */
package csci4380.finalp.init;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import csci4380.finalp.dogs.mongodb.model.Dog;
import csci4380.finalp.dogs.mongodb.repo.DogRepository;



/**
 * @author Charles
 *
 */
@Component
public class InitDogMongoDbCollection implements CommandLineRunner {
private DogRepository dogRepository;

public InitDogMongoDbCollection(DogRepository dogRepository) {
	this.dogRepository = dogRepository;
}
@Override
public void run(String... args) throws Exception {
	Dog t1 = new Dog(304, "Frank", "Bengal", "Lauren", "45 Pole Lane", 20, false, "5/12/2018");
	Dog t2 = new Dog(209, "Shane", "Bengal", "Tommie", "723 Sammy Street", 16, true, "5/14/2018");
	Dog t3 = new Dog(865, "Edward", "Bengal", "Harry", "804 Gerald Avenue", 12, false, "5/17/2018");
	
	List<Dog> dogs = Arrays.asList(t1,t2,t3);
	dogRepository.saveAll(dogs);
}
}
