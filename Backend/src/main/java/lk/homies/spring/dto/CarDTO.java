package lk.homies.spring.dto;

import lk.homies.spring.entity.Img;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 10:00 PM
 * @project Spring File Upload
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CarDTO {
    String name;
    String brand;
    List<ImgDTO> img;
}
