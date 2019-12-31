package studyspringcloud.weathercityeureka.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studyspringcloud.weathercityeureka.service.CityDataService;
import studyspringcloud.weathercityeureka.vo.City;

/**
 * @author sparkchan
 * @date 2019/12/29
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityDataService cityDataService;

    @GetMapping("cities")
    public List<City> listCity() throws Exception {
        return cityDataService.listCity();
    }
}
