package lk.homies.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 9:14 PM
 * @project Spring File Upload
 */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"lk.homies.spring"})
public class WebAppConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
