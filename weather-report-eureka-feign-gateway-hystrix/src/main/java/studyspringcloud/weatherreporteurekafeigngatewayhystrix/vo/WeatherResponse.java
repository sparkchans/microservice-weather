package studyspringcloud.weatherreporteurekafeigngatewayhystrix.vo;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * 天气返回
 *
 * @author sparkchan
 * @date 2019/12/28
 */
@Setter
@Getter
public class WeatherResponse implements Serializable {
    private static final long serialVersionUID = -4313532063984778714L;

    private Weather data;
    private Integer status;
    private String desc;

    @Override
    public String toString() {
        return "WeatherResponse{" + "data=" + data + ", status=" + status + ", desc='" + desc + '\'' + '}';
    }
}
