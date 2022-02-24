package emlakburada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import emlakburada.client.BannerClientOpenFeign;
import emlakburada.client.request.BannerRequest;
import emlakburada.client.response.BannerResponse;

@Service
public class BannerClientService  {

	
	public BannerRequest prepareBanner() {

		BannerRequest request = new BannerRequest();
		request.setAddress(null);
		request.setAdvertNo(112);
		request.setPhone("56852");
		request.setTotal(14);

		return request;

	
	}
}