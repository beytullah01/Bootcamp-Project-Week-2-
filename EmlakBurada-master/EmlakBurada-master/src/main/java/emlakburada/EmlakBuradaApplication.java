package emlakburada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import emlakburada.repository.IlanRepository;
import emlakburada.service.AdvertService;
import emlakburada.service.Singleton;

@SpringBootApplication
@ComponentScan()
@EnableFeignClients  
public class EmlakBuradaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmlakBuradaApplication.class, args);

		Singleton singleton = Singleton.getSingletonInstance();
		
		System.out.println(singleton.toString());
		
		
		Singleton singleton1 = Singleton.getSingletonInstance();
		
		System.out.println(singleton1.toString());
	}

//	@Bean
//	public IlanService ilanService() {
//		return new IlanService();
//	}
//
//	@Bean
//	public IlanRepository ilanRespository() {
//		return new IlanRepository();
//	}
	

}
