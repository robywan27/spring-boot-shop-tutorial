package com.codaholic.shop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity // maps the class to a db table
@Data // generates getters, setters, toString(), equals(), hashCode()
@EqualsAndHashCode(callSuper = false)
@Builder // generates a builder pattern for the class
@NoArgsConstructor // generates constructors with no args
@AllArgsConstructor // generates constructors with all args
@Table(name = "product") // specifies the name of the db table associated with this entity
public class Product {
    @Id // primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @NotEmpty(message = "Name cannot be blank") // checks if value is not null and not empty
    @Column(unique = true)
    private String name;

    private long quantity;
    private double unitPrice;
}
