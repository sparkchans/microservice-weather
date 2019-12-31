package studyspringcloud.weathercollectioneurekafeign.service;

/**
 * @author sparkchan
 * @date 2019/12/29
 */
public interface WeatherDataCollectionService {
    /**
     * 根据城市 ID 同步天气
     *
     * @param cityId
     */
    void syncDataByCityId(String cityId);
}
