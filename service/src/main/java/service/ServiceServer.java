package service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceServer {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "service");
        SpringApplication.run(ServiceServer.class, args);
    }

    @Bean
    public CommandLineRunner createDB(ServiceRepository repository){
        return (args) ->{
          repository.save(new ServiceEntity("testvalue"));
        };
    }
}
