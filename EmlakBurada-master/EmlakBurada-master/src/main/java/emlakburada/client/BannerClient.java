/*
 * package emlakburada.client;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import emlakburada.client.request.AddressRequest; import
 * emlakburada.client.request.BannerRequest; import
 * emlakburada.client.response.BannerResponse;
 * 
 * @Service public class BannerClient {
 * 
 * 
 * 
 * public void saveBanner() {
 * 
 * 
 * ResponseEntity<BannerResponse> response =
 * restTemplate.postForEntity(bannerServiceUrl, prepareSaveBannerRequest(),
 * BannerResponse.class); System.out.println(response.toString());
 * 
 * if (response.getStatusCode() == HttpStatus.OK) {
 * System.out.println(response.getBody().toString()); } else {
 * System.out.println("Banner Service Status Code: " +
 * response.getStatusCode()); } }
 * 
 * private BannerRequest prepareSaveBannerRequest() { BannerRequest request =
 * new BannerRequest(); request.setAdvertNo(0); request.setPhone("555");
 * request.setTotal(1); request.setAddress(new AddressRequest("istanbul",
 * "kadıköy", "acik adres")); return request; }
 * 
 * }
 */