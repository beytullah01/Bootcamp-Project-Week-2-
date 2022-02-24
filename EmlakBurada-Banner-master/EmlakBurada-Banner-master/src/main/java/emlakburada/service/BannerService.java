package emlakburada.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.model.Banner;
import emlakburada.repository.BannerRepository;

@Service
public class BannerService {
	
	@Autowired
	private BannerRepository bannerRepository;
	
	
	public List<BannerResponse> getAllBanner(){
		
		List<BannerResponse> bannerResponses=new ArrayList<BannerResponse>();
		
		for (Banner banner : bannerRepository.getAllBanners()) {
			
			bannerResponses.add(convertToBannerResponse(banner));
		}
		
		return bannerResponses;
	}
	
	private BannerResponse convertToBannerResponse(Banner banner) {
		
		BannerResponse bannerResponse=new BannerResponse();
		bannerResponse.setAdvertNo(banner.getAdvertNo());
		bannerResponse.setPhone(banner.getPhone());
		bannerResponse.setTotal(banner.getTotal());
		
		return bannerResponse;
	}
	
	private Banner convertToBanner(BannerRequest request) {
		
		Banner banner=new Banner();
		banner.setAdvertNo(request.getAdvertNo());
		banner.setPhone(request.getPhone());
		banner.setTotal(request.getTotal());
		
		return banner;
	}
	
	
	public BannerResponse saveBanner(BannerRequest request) {
		
		Banner banner=bannerRepository.saveBanner(convertToBanner(request));
		
		return convertToBannerResponse(banner);
		
	}
	
	
	
}
