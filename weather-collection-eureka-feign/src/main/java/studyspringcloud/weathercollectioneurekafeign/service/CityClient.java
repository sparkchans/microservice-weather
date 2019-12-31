package studyspringcloud.weathercollectioneurekafeign.service;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import studyspringcloud.weathercollectioneurekafeign.vo.City;

/**
 * @author sparkchan
 * @date 2019/12/30
 */
@FeignClient("weather-city-eureka")
public interface CityClient {
    @GetMapping("/city/cities")
    List<City> listCity() throws Exception;
}
