package com.tranning_spring.ecommerce.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
@Data
public class ProductsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
   private long id ;
    @Column(name = "category_name")
   private String categoryName ;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
  private Set<Product> products ;

}
