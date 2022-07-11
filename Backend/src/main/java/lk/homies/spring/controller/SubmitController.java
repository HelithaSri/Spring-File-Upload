package lk.homies.spring.controller;

import lk.homies.spring.dto.CarDTO;
import lk.homies.spring.dto.FormDataWithFileDTO;
import lk.homies.spring.dto.ImgDTO;
import lk.homies.spring.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 9:58 PM
 * @project Spring File Upload
 */
@RestController
@RequestMapping("/done")
@CrossOrigin
public class SubmitController {

    @Autowired
    CarService service;
//    multipart/form-data
    @PostMapping //(consumes = "multipart/form-data")
    public void saveForm(@RequestPart("carDTO") CarDTO carDTO,  @RequestPart("file") MultipartFile file){
        System.out.println(file);
//        service.SaveData(carDTO, file);
    }


    @PostMapping("/a") //(consumes = "multipart/form-data")
    public void saveForma(@ModelAttribute FormDataWithFileDTO formDataWithFileDTO){
        System.out.println(formDataWithFileDTO.toString());
        ImgDTO imgDTO = new ImgDTO("IMG001", "");
        List<ImgDTO> dtoList = new ArrayList<>();
        dtoList.add(imgDTO);
        CarDTO carDTO = new CarDTO(formDataWithFileDTO.getName(), formDataWithFileDTO.getBrand(), dtoList);

        service.SaveData(carDTO, formDataWithFileDTO.getFile());
    }

}
