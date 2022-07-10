package lk.homies.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 9:59 PM
 * @project Spring File Upload
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Car {
    @Id
    String name;
    String brand;

    @OneToMany
    List<Img> img;
}
