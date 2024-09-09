package cp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configuracion {
    @Bean
    public RestTemplate restexternal(){
        return new RestTemplate();
    }
}
