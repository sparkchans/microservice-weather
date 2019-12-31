package studyspringcloud.weatherreporteurekafeigngatewayhystrix.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import studyspringcloud.weatherreporteurekafeigngatewayhystrix.vo.City;
import studyspringcloud.weatherreporteurekafeigngatewayhystrix.vo.WeatherResponse;

/**
 * @author sparkchan
 * @date 2019/12/31
 */
@Component
public class DataClientFallback implements DataClient {
    @Override
    public List<City> listCity() throws Exception {
        List<City> cityList = null;
        cityList = new ArrayList<>();

        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cityList.add(city);

        city = new City();
        city.setCityId("101280301");
        city.setCityName("惠州");
        cityList.add(city);

        return cityList;
    }

    @Override
    public WeatherResponse getDataByCityId(
            String cityId) {
        return null;
    }
}
