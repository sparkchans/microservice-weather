package studyspringcloud.weatherreporteurekafeigngatewayhystrix.service;

import studyspringcloud.weatherreporteurekafeigngatewayhystrix.vo.Weather;

/**
 * @author sparkchan
 * @date 2019/12/30
 */
public interface WeatherReportService {
    /**
     * 根据城市 ID 查询天气信息
     * @param cityId
     * @return
     */
    Weather getDataByCityId(String cityId);
}
