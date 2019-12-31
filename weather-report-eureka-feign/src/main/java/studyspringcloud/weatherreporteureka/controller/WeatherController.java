package studyspringcloud.weatherreporteureka.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import studyspringcloud.weatherreporteureka.service.CityClient;
import studyspringcloud.weatherreporteureka.service.WeatherReportService;
import studyspringcloud.weatherreporteureka.vo.City;

/**
 * @author sparkchan
 * @date 2019/12/30
 */
@RestController
@RequestMapping("/report")
public class WeatherController {
    private final static Logger logger = LoggerFactory.getLogger(WeatherController.class);

    @Autowired
    private WeatherReportService weatherReportService;
    @Autowired
    private CityClient cityClient;

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) {
        // 获取城市ID列表
        List<City> cityList = null;

        try {

            // 由城市数据API微服务提供数据
            cityList = cityClient.listCity();

        } catch (Exception e) {
            logger.error("Exception!", e);
        }

        model.addAttribute("title", "老卫的天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityList);
        model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }
}
