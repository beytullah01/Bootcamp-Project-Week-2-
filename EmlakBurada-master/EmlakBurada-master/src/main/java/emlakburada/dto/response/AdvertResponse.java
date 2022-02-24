package emlakburada.dto.response;

import java.math.BigDecimal;
import java.util.Date;

import emlakburada.model.RealEstate;
import emlakburada.model.User;
import lombok.Data;

@Data
public class AdvertResponse {

	private int advertNo;
	private RealEstate gayrimenkul;
	private String baslik;
	private User kullanici; // hem bireysel & kurumsal
	private String[] resimList = new String[5];
	private BigDecimal fiyat;
	private int suresi;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private Date olusturulmaTarihi;
	private boolean aktifMi;

}
