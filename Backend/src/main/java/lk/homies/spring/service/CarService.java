package lk.homies.spring.service;

import lk.homies.spring.dto.CarDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 10:10 PM
 * @project Spring File Upload
 */

public interface CarService {

    void SaveData(CarDTO carDTO, MultipartFile file);

    List<CarDTO> getData();

}
