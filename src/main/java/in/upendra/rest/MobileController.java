package in.upendra.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.upendra.binding.MobileSearchRequest;
import in.upendra.entities.MobileEntity;
import in.upendra.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	private MobileService mobileService;

	@PostMapping("/mobiles")
	public List<MobileEntity> getMobiles(MobileSearchRequest searchRequest) {
		List<MobileEntity> findMobiles = mobileService.findMobiles(searchRequest);
		return findMobiles;

	}

}
