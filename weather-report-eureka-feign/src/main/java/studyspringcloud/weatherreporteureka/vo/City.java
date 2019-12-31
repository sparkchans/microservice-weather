package studyspringcloud.weatherreporteureka.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
