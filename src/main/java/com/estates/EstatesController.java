package com.estates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstatesController {
	
	@Autowired
	private EstateRepository estateRepository;
	
	@RequestMapping(value="/estates",method=RequestMethod.POST)
	public String addEstate(@RequestBody Estates estates){
		String msg;
		System.out.println(estates.toString());
		
		if(estateRepository.save(estates)!=null){
			
			msg = "saved !!";
		}else{
			
			msg="error occured while saving !!";
		}
		
		return msg;
		
	}
	
	
//	@RequestMapping("/estates")
//	public List<Estates> getAllEstates(){
//		return estatesService.getAllEstates();
//		
//	}
//	
//	@RequestMapping("/estates/{id}")
//	public Estates getEstate(@PathVariable int id ){
//		
//		
//		return estatesService.getEstate(id);
//		
//	}
//	
//	@RequestMapping(value="/estates",method=RequestMethod.POST)
//	public void addEstate(@RequestBody Estates estates){
//		
//		estatesService.addEstate(estates);
//	}
//	
//	@RequestMapping(value="/estates/{id}",method=RequestMethod.PUT)
//	public void updateEstate(@PathVariable int id,@RequestBody Estates estates){
//		
//		estatesService.updateEstate(id,estates);
//	}
//	
//	@RequestMapping(value="/estates/{id}",method=RequestMethod.DELETE)
//	public void deleteEstate(@PathVariable int id){
//		
//		estatesService.deleteEstate(id);
//	}
}
