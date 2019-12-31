package studyspringcloud.weathercollectioneurekafeign.job;

import java.util.ArrayList;
import java.util.List;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import studyspringcloud.weathercollectioneurekafeign.service.CityClient;
import studyspringcloud.weathercollectioneurekafeign.service.WeatherDataCollectionService;
import studyspringcloud.weathercollectioneurekafeign.vo.City;

/**
 * @author sparkchan
 * @date 2019/12/29
 */
public class WeatherDataSyncJob extends QuartzJobBean {
    private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Autowired
    private CityClient cityClient;
    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("Weather Data Sync Job. Start!");
        List<City> cityList = null;
        try {
            cityList = cityClient.listCity();
        } catch (Exception e) {
            logger.error("Exception!", e);
        }
        for (City city : cityList) {
            String cityId = city.getCityId();
            logger.info("Weather Data Sync Job, cityId:" + cityId);
            weatherDataCollectionService.syncDataByCityId(cityId);
        }
        logger.info("Weather Data Sync Job. End!");
    }
}
