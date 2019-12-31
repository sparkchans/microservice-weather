package studyspringcloud.weathercollectioneurekafeign.service;

import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author sparkchan
 * @date 2019/12/29
 */
@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService {
    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";

    private static final long TIME_OUT = 1800L;

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public void syncDataByCityId(String cityId) {
        String uri = WEATHER_URI.concat("citykey=") + cityId;
        this.saveWeatherData(uri);
    }

    /**
     * 把天气数据放在缓存
     *
     * @param uri
     */
    private void saveWeatherData(String uri) {
        String key = uri;
        String stringBody = null;
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ResponseEntity<String> resString = restTemplate.getForEntity(uri, String.class);
        if (resString.getStatusCodeValue() == 200) {
            stringBody = resString.getBody();
            System.out.println(stringBody);
        }
        ops.set(key, stringBody, TIME_OUT, TimeUnit.SECONDS);
    }
}
