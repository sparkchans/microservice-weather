package studyspringcloud.weatherreporteurekafeigngateway.vo;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * 昨日天气
 *
 * @author sparkchan
 * @date 2019/12/28
 */
@Getter
@Setter
public class YesterdayWeather implements Serializable {
    private static final long serialVersionUID = 5022201728381534019L;
    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;
    private String type;

    @Override
    public String toString() {
        return "YesterdayWeather{" + "date='" + date + '\'' + ", high='" + high + '\'' + ", fx='" + fx + '\'' + ", low='" + low + '\'' + ", fl='" + fl + '\'' + ", type='" + type + '\'' + '}';
    }
}
