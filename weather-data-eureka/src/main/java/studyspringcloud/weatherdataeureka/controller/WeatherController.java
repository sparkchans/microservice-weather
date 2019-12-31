package studyspringcloud.weatherdataeureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studyspringcloud.weatherdataeureka.service.WeatherDataService;
import studyspringcloud.weatherdataeureka.vo.WeatherResponse;

/**
 * @author sparkchan
 * @date 2019/12/30
 */
@RestController
@RequestMapping("/data/weather")
public class WeatherController {
    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }
}
