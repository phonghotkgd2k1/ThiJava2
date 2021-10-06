package thi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book  implements Serializable {
    private String code;
    private String title;
    private String author;
    private Double price;
}
