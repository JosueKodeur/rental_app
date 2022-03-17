package com.jvision.rental.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "properties")
@Builder
@Entity
public class Property {

    @Id
    @Column(name = "property_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyId;
    private String title;
    private double size;
}
