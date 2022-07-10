package lk.homies.spring.dto;

import lk.homies.spring.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

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
    private String imgId;
    private String path;
//    private CarDTO car;
//    Car car;
//    MultipartFile file;

    /*public ImgDTO(String imgId, String path, Car car, MultipartFile file) {
        this.imgId = imgId;
        this.path = path;
        this.car = car;
        this.file = file;
    }

    public ImgDTO(String imgId, String path, Car car) {
        this.imgId = imgId;
        this.path = path;
        this.car = car;
    }*/
}
