package lk.homies.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Helitha Sri
 * @created 7/10/2022 - 10:00 PM
 * @project Spring File Upload
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
//@IdClass(CarImg.class)
public class Img{
    @Id
    private String imgId;
//    private String carId;
    private String path;
/*
    @ManyToOne
    @JoinColumn(name="car", nullable = false)
    Car car;*/
}
