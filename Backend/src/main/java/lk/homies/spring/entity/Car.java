package lk.homies.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
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
    private String name;
    private String brand;

    @OneToMany(targetEntity = Img.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ca_fk", referencedColumnName = "name")
    private List<Img> img;
}
