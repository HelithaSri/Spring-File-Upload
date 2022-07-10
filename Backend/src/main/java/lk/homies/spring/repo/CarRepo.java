package lk.homies.spring.repo;

import lk.homies.spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 10:09 PM
 * @project Spring File Upload
 */

public interface CarRepo extends JpaRepository<Car,String> {

}
