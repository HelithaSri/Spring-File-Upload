package lk.homies.spring.repo;

import lk.homies.spring.entity.Img;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Helitha Sri
 * @created 7/11/2022 - 12:04 AM
 * @project Spring File Upload
 */

public interface ImgRepo extends JpaRepository<Img,String> {
}
