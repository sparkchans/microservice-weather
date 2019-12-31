package studyspringcloud.weatherdataeureka.service;

import studyspringcloud.weatherdataeureka.vo.WeatherResponse;

/**
 * 天气数据服务
 *
 * @author sparkchan
 * @date 2019/12/28
 */
public interface WeatherDataService {
    /**
     * 根据城市 ID 查询天气数据
     *
     * @param cityId
     * @return 天气数据
     */
    WeatherResponse getDataByCityId(String cityId);
}
