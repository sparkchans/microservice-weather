package studyspringcloud.weatherreporteurekafeigngateway.service;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import studyspringcloud.weatherreporteurekafeigngateway.vo.City;
import studyspringcloud.weatherreporteurekafeigngateway.vo.WeatherResponse;

/**
 * @author sparkchan
 * @date 2019/12/31
 */
@FeignClient("weather-city-eureka-zuul")
public interface DataClient {
    /**
     * 获取城市列表
     * @return
     * @throws Exception
     */
    @GetMapping("/weather-city-eureka/city/cities")
    List<City> listCity() throws Exception;

    /**
     * 更具城市 ID 查询天气数据
     */
    @GetMapping("/weather-data-eureka/data/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
