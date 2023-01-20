package com.example.check.Entity;

/*import javax.persistence.*;*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_tbl")
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer price;
    private Integer quantity;


}
