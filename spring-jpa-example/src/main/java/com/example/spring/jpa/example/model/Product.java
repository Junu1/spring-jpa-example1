package com.example.spring.jpa.example.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name",length = 50,nullable = false)
    private String name;
    @Column(name="description",length = 255,nullable = false)
    private String description;
    private Double price;
    private Integer totalStock;

}
