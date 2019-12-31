package studyspringcloud.weatherreporteureka.vo;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * 未来天气
 *
 * @author sparkchan
 * @date 2019/12/28
 */
@Getter
@Setter
public class Forecast implements Serializable {
    private static final long serialVersionUID = -3796428159519106707L;

    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;

    @Override
    public String toString() {
        return "Forecast{" + "date='" + date + '\'' + ", high='" + high + '\'' + ", fengli='" + fengli + '\'' + ", low='" + low + '\'' + ", fengxiang='" + fengxiang + '\'' + ", type='" + type + '\'' + '}';
    }
}
