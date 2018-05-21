/**
 * 
 */
package csci4380.finalp.cats.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import csci4380.finalp.cats.jpa.model.Cat;
import csci4380.finalp.cats.jpa.repo.CatRepository;

/**
 * @author Charles
 *
 */

@RestController
@RequestMapping("/rest/v1/cats")
public class CatRestController {
	@Autowired
	private CatRepository catRepository;
	public CatRestController(CatRepository catRepository) {
		this.catRepository = catRepository;
	}
	
	@RequestMapping("/echoMessage")
	public String echoMessage(@RequestParam(value ="msg", defaultValue="charles echoed") String msg)
	{
		return "echoMessage echoed:" + msg;
	}
	
	@GetMapping("")
	public Page<Cat> findAll(@RequestParam(defaultValue="0") int page, @RequestParam(value="rowsPerPage", defaultValue="5") int size) {
		Page<Cat> catsPage = catRepository.findAll(new PageRequest(page, size));
		return catsPage;
	}

	@GetMapping("/all")
	public  List<Cat> findAll() {
		List<Cat> cats = catRepository.findAll();
		return cats;
	}
	
	@PostMapping("")
	public  Optional<Cat> save(@RequestBody final Cat cat) {
		Cat savedCat = catRepository.save(cat);
		return catRepository.findById(savedCat.getPetId());
	}
	
	@DeleteMapping("/{petId}")
	public  void delete(@PathVariable("petId") Integer id) {
		catRepository.deleteById(id);
	}
	
	
	@GetMapping("/byNameOrOwnerName/{name}/{ownerName}")
	public  List<Cat> findByNameIgnoreCaseQuery(@PathVariable String name, @PathVariable String ownerName) {
		List<Cat> cat = catRepository.findByNameOrOwnerName(name, ownerName);
		return cat;
	}
	
}

