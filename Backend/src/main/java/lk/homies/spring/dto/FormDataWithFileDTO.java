package lk.homies.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Helitha Sri
 * @created 7/11/2022 - 3:01 PM
 * @project Spring File Upload
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class FormDataWithFileDTO {
    private String name;
    private String brand;
    private MultipartFile file;
}
