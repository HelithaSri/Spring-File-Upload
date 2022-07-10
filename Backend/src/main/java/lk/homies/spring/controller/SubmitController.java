package lk.homies.spring.controller;

import lk.homies.spring.dto.CarDTO;
import lk.homies.spring.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 9:58 PM
 * @project Spring File Upload
 */
@RestController
@RequestMapping("/done")
public class SubmitController {

    @Autowired
    CarService service;

    @PostMapping
    public void saveForm(@RequestPart("carDTO") CarDTO carDTO, @RequestPart("file") MultipartFile file){
        System.out.println(carDTO.toString());
        service.SaveData(carDTO, file);
    }

}
