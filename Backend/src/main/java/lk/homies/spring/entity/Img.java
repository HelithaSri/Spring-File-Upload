package lk.homies.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Img{
    @Id
    String imgId;
    String path;
    @ManyToOne
    @JoinColumn(name="name")
    Car car;
}
