package studyspringcloud.weatherreporteureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import studyspringcloud.weatherreporteureka.vo.WeatherResponse;

/**
 * @author sparkchan
 * @date 2019/12/30
 */
@FeignClient("weather-data-eureka")
public interface WeatherDataClient {
    @GetMapping("/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
