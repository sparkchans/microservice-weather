package studyspringcloud.weatherdataeureka.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import studyspringcloud.weatherdataeureka.vo.WeatherResponse;

/**
 * @author sparkchan
 * @date 2019/12/28
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {
    private final static Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);
    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";
    private static final long TIME_OUT = 1800L;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_URI.concat("citykey=").concat(cityId);
        return this.doGetWeather(uri);
    }

    private WeatherResponse doGetWeather(String uri) {
        WeatherResponse resp = null;
        String strBody = null;
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ObjectMapper mapper = new ObjectMapper();
        String key = uri;
        if (redisTemplate.hasKey(key)) {
            logger.info("Redis has data");
            strBody = ops.get(key);
        } else {
            logger.info("Redis doesn't has data");
        }
        try {
            resp = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resp;
    }
}
