package studyspringcloud.weatherreporteurekafeigngatewayhystrix.vo;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * 天气信息
 *
 * @author sparkchan
 * @date 2019/12/28
 */
@Setter
@Getter
public class Weather implements Serializable {
    private static final long serialVersionUID = 6014636914299901134L;

    private String city;
    private String aqi;
    private String ganmao;
    private String wendu;
    private YesterdayWeather yesterday;
    private List<Forecast> forecast;

    @Override
    public String toString() {
        return "Weather{" + "city='" + city + '\'' + ", aqi='" + aqi + '\'' + ", ganmao='" + ganmao + '\'' + ", wendu='" + wendu + '\'' + ", yesterday=" + yesterday + ", forecast=" + forecast + '}';
    }
}
