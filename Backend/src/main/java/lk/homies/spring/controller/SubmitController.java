package lk.homies.spring.controller;

import lk.homies.spring.dto.CarDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 9:58 PM
 * @project Spring File Upload
 */
@RestController
@RequestMapping("/done")
public class SubmitController {

    @PostMapping
    public void saveForm(@ModelAttribute CarDTO carDTO){

    }

}
