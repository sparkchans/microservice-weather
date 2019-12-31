package studyspringcloud.weatherreporteurekafeigngatewayhystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studyspringcloud.weatherreporteurekafeigngatewayhystrix.vo.Weather;
import studyspringcloud.weatherreporteurekafeigngatewayhystrix.vo.WeatherResponse;

/**
 * @author sparkchan
 * @date 2019/12/30
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
    @Autowired
    private DataClient dataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        WeatherResponse response = dataClient.getDataByCityId(cityId);
        return response.getData();
    }
}
