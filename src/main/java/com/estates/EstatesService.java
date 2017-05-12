package com.estates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class EstatesService implements EstateRepository {
	
	
	
	
	
//	private List<Estates> list = new ArrayList<>();
//	
//	
//	
//	
//	
//	public List<Estates> getAllEstates(){
//		return null;
//		
//		
//		
//		//return  (List<Estates>) estateRepository.findAll();
//	}
//	
//	public Estates getEstate(int id){
//		
//		Estates obj = new Estates();
//		
//		List<Estates> estate = new ArrayList<>();
//		
//		for(int i=0;i<list.size();i++){
//			
//			if(list.get(i).getId() == id){
//				
//				obj.setId(list.get(i).getId());
//				obj.setPropertyType(list.get(i).getPropertyType());
//				obj.setPrice(list.get(i).getPrice());
//				//obj.setEstateDetails(list.get(i).getEstateDetails());
//				obj.setAddress(list.get(i).getAddress());
//				obj.setImgLocation(list.get(i).getImgLocation());
//				
//			}
//		}
//		
//		return obj;
//		
//
//		
//	}
//
//	public void addEstate(Estates estates) {
//		
//		//estateRepository.save(estates);
//	}
//
//	public void updateEstate(int id, Estates estates) {
//		
//		for(int i=0;i<list.size();i++){
//			
//			if(id == list.get(i).getId())
//			{
//				list.set(i, estates);
//			}
//		}
//		
//	}
//
//	public void deleteEstate(int id) {
//		
//		for(int i=0;i<list.size();i++){
//			
//			if(id == list.get(i).getId()){
//				
//				list.remove(i);
//			}
//		}
//		
//	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Estates arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Estates> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Estates> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Estates> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estates findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estates> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estates> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
