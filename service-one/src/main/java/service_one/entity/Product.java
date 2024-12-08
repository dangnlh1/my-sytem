package service_one.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "product")
//@Setter
//@Getter
//public class Product {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private String brand;
//    private String madein;
//    private float price;
//
//}

// Chỉ định lớp này là một entity của JPA, nghĩa là nó sẽ ánh xạ tới một bảng trong cơ sở dữ liệu.
@Entity
@Getter
@Setter
@Table(name = "product_system")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_product")
    private String name;

    private String brand;

    private String madein;

    private float price;
}