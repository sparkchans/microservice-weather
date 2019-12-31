package studyspringcloud.weatherreporteureka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studyspringcloud.weatherreporteureka.vo.Weather;
import studyspringcloud.weatherreporteureka.vo.WeatherResponse;

/**
 * @author sparkchan
 * @date 2019/12/30
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
    @Autowired
    private WeatherDataClient weatherDataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        WeatherResponse response = weatherDataClient.getDataByCityId(cityId);
        return response.getData();
    }
}
