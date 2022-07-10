package lk.homies.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 9:14 PM
 * @project Spring File Upload
 */

@Configuration
@Import({JPAConfig.class})
public class WebRootConfig {
}
