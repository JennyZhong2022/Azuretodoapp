package nology.todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    String[] allowedOrigins = {
        "http://localhost:5173",
        "http://127.0.0.1:5173",
        "http://jennytodo-list.s3-website-ap-southeast-2.amazonaws.com",
        "https://black-coast-090609c00.5.azurestaticapps.net"
    };
    registry.addMapping("/**")
        .allowedOrigins(allowedOrigins)
        .allowedMethods("*")
        .allowedHeaders("*");
  }
}
