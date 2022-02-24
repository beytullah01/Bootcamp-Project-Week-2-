package emlakburada.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import emlakburada.model.Banner;

@Repository
public class BannerRepository {
	
	List<Banner> banners=new ArrayList<>();
	
	public List<Banner> getAllBanners(){
		
		return banners;
	}
	
	public Banner saveBanner(Banner banner) {
		
		banners.add(banner);
		return banner;
	}
	
	

}
