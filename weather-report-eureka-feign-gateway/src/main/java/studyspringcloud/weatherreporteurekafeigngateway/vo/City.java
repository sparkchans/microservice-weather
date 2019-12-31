package studyspringcloud.weatherreporteurekafeigngateway.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sparkchan
 * @date 2019/12/28
 */
@Setter
@Getter
public class City {
    private String cityId;

    private String cityName;

    private String cityCode;

    private String province;

    @Override
    public String toString() {
        return "City{" + "cityId='" + cityId + '\'' + ", cityName='" + cityName + '\'' + ", cityCode='" + cityCode + '\'' + ", province='" + province + '\'' + '}';
    }
}
