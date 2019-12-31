package studyspringcloud.weathercityeureka.service;


import java.util.List;
import studyspringcloud.weathercityeureka.vo.City;

/**
 * @author sparkchan
 * @date 2019/12/28
 */
public interface CityDataService {
    /**
     * 获取城市列表
     *
     * @return
     * @throws Exception
     */
    List<City> listCity() throws Exception;
}
