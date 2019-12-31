package studyspringcloud.weatherreporteureka.service;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import studyspringcloud.weatherreporteureka.vo.City;

/**
 * @author sparkchan
 * @date 2019/12/30
 */
@FeignClient("weather-city-eureka")
public interface CityClient {
    @GetMapping("/cities")
    List<City> listCity() throws Exception;
}
