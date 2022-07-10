package lk.homies.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Helitha Sri
 * @created 7/11/2022 - 12:16 AM
 * @project Spring File Upload
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarImg implements Serializable {
    String imgId;
    String carId;
}
