package lk.homies.spring.dto;

import lk.homies.spring.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 10:05 PM
 * @project Spring File Upload
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ImgDTO {
    String imgId;
    String path;
    Car car;
}
