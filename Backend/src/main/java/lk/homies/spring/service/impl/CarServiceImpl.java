package lk.homies.spring.service.impl;

import lk.homies.spring.dto.CarDTO;
import lk.homies.spring.dto.ImgDTO;
import lk.homies.spring.entity.Car;
import lk.homies.spring.repo.CarRepo;
import lk.homies.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 10:10 PM
 * @project Spring File Upload
 */

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void SaveData(CarDTO carDTO, MultipartFile file) {
        String path = null;
//        Car car = repo.findById(carDTO.getName()).get();
        for (ImgDTO dto : carDTO.getImg()) {
//            dto.setCar(mapper.map(car,CarDTO.class));
            try {
                String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
                File uploadDir = new File(projectPath + "/uploads");
                System.out.println("uploadDir : "+uploadDir);
                uploadDir.mkdir();
                file.transferTo(new File(uploadDir.getAbsolutePath()+"/"+file.getOriginalFilename()));
                path="uploads/"+file.getOriginalFilename();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            dto.setPath(path);
            System.out.println("path : "+path);
        }
        repo.save(mapper.map(carDTO, Car.class));
    }

    @Override
    public List<CarDTO> getData() {
        return mapper.map(repo.findAll(), new TypeToken<List<CarDTO>>() {
        }.getType());
    }
}
