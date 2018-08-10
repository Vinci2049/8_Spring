package onlineStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import onlineStore.service.DemoServiceImpl;

@SpringBootApplication
public class Main {
		 	
	public static void main(String[] args) {
		
        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        
        DemoServiceImpl demoService = new DemoServiceImpl();
        demoService.showDemoProduct(applicationContext);
        
	}	
	
}
