package sit.int202.simple.simple.entities;

import lombok.*;

// set ให้ Lombok ทำให้เราไม่ต้องใส่พวก Getter Setter Constructor เอง
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    private String id;
    private String title;
    private double credit;


}



