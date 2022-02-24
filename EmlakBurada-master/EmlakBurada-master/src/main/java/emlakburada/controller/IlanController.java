package emlakburada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import emlakburada.dto.AdvertRequest;
import emlakburada.dto.response.AdvertResponse;
import emlakburada.model.User;
import emlakburada.service.AdvertService;
import emlakburada.service.KullaniciService;

@RestController
public class IlanController {
	
	@Autowired
	private AdvertService advertService;
	
	@Autowired
	private KullaniciService kullaniciService;

	@GetMapping(value = "/adverts")
	public ResponseEntity<List<AdvertResponse>> getAllAdvert() {
		return new ResponseEntity<>(advertService.getAllAdverts(), HttpStatus.OK);
	}

	@PostMapping(value = "/adverts")
	public ResponseEntity<AdvertResponse> createAdvert(@RequestBody AdvertRequest request) {
		return new ResponseEntity<>(advertService.saveAdvert(request), HttpStatus.CREATED);
	}

	@GetMapping(value = "/adverts/{advertNo}")
	public ResponseEntity<AdvertResponse> getAdvertByAdvertId(@PathVariable(required = false) int advertNo) {
		return new ResponseEntity<>(advertService.getAdvertByAdvertId(advertNo), HttpStatus.OK);
	}
	
	@GetMapping(value="/adverts/{kullaniciId}")
	public ResponseEntity<?> getAdvertFavById(@PathVariable  Integer kullaniciId) {
		
		
		return new ResponseEntity<>(kullaniciService.findByIdUser(kullaniciId.intValue()).getFavoriIlanlar(), HttpStatus.OK);
	}

}
