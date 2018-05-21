/**
 * 
 */
package csci4380.finalp.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import csci4380.finalp.cats.jpa.model.Cat;
import csci4380.finalp.cats.jpa.repo.CatRepository;

/**
 * @author Charles
 *
 */

@Component
public class InitCatDb implements CommandLineRunner{
	private CatRepository catRepository;
	@Autowired
	public InitCatDb(CatRepository catRepository) {
		super();
		this.catRepository = catRepository;
	}
public void run(String... args) throws Exception {
	Cat catOne = new Cat("Bob", "Bengal", "Tony", "21 Farmer Street", 5, true, "04/21/2018");
	Cat savedCatOne = catRepository.save(catOne);
	System.out.println("--> Bob --> Saved catOne");
	
	Cat catTwo = new Cat("Bill", "Bengal", "Tiara", "32 Marker Avenue", 13, false, "05/13/2018");
	Cat savedCatTwo = catRepository.save(catTwo);
	System.out.println("--> Bill --> Saved catTwo");
	
	Cat catThree = new Cat("Harold", "Bengal", "Lisa", "4678 Pearl Road", 11, true, "05/14/2018");
	Cat savedCatThree = catRepository.save(catThree);
	System.out.println("--> Harold --> Saved catThree");


}
}
