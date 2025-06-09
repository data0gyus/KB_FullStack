package TIL.practice0508.Basic.sec04.exam01;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
// @Data
public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;
}
