package com.shree.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_detail_id")
    private ProductDetail productDetail;
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private ProductCategory category;

    private String sku;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private String imageUrl;

    private boolean activate;

    private int unitInStock;
    @JsonIgnore
    @CreationTimestamp
    private Date dateCreated;
    @JsonIgnore
    @UpdateTimestamp
    private Date lastUpdated;

}
