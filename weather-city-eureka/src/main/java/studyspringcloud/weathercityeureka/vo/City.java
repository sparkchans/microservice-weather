package studyspringcloud.weathercityeureka.vo;

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
@XmlRootElement(name = "d")
@XmlAccessorType(XmlAccessType.FIELD)
@Setter
@Getter
public class City {
    @XmlAttribute(name = "d1")
    private String cityId;

    @XmlAttribute(name = "d2")
    private String cityName;

    @XmlAttribute(name = "d3")
    private String cityCode;

    @XmlAttribute(name = "d4")
    private String province;

    @Override
    public String toString() {
        return "City{" + "cityId='" + cityId + '\'' + ", cityName='" + cityName + '\'' + ", cityCode='" + cityCode + '\'' + ", province='" + province + '\'' + '}';
    }
}
