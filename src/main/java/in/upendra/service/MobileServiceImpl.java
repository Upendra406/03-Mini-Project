package in.upendra.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.upendra.binding.MobileSearchRequest;
import in.upendra.entities.MobileEntity;
import in.upendra.repositories.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public List<MobileEntity> findMobiles(MobileSearchRequest searchRequest) {
		
		if(searchRequest == null) {
			return mobileRepository.findAll();
		}
		
		MobileEntity mobile = new MobileEntity();
		
		if(null != searchRequest.getBrand() && !"".equals(searchRequest.getBrand())) {
			mobile.setBrand(searchRequest.getBrand());
		}
		if(null != searchRequest.getRam()) {
			mobile.setRam(searchRequest.getRam());
		}
		
		Example<MobileEntity> example = Example.of(mobile);
		
		List<MobileEntity> mobiles = mobileRepository.findAll(example);
		
		if(null != searchRequest.getPrice()) {
			List<MobileEntity> priceFilterList = mobiles.stream()
					                     				 .filter(mob -> mob.getPrice() <= searchRequest.getPrice())
					                     				 .collect(Collectors.toList());
			return priceFilterList;	
		}
		return mobiles;
	}

	
	

}	