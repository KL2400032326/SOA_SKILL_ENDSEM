package soa.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soa.Repo.ResturantRepo;
import soa.model.Resturant;

@Service
public class ResturantService {
   @Autowired
   ResturantRepo rr;
   public ResturantService(ResturantRepo rr) {
	   this.rr=rr;
   }
   public Object getAllResturants() {
	   Map<String , Object> response=new HashMap<>();
	   try {
		   List<Resturant> resturants =rr.findAll();
		   response.put("code",200);
		   response.put("Resturants",resturants);
	   }
	   catch(Exception e) {
		   response.put("code",500);
		   response.put("message",e.getMessage());
	   }
	   return response;
   }
}
