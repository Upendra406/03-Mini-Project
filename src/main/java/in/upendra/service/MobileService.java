package in.upendra.service;

import java.util.List;

import in.upendra.binding.MobileSearchRequest;
import in.upendra.entities.MobileEntity;

public interface MobileService {

	public List<MobileEntity> findMobiles(MobileSearchRequest searchRequest);


}
