package com.asiastar.bookleaf.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Getter
@Setter
@Table(schema = SchemaName.SchemaName)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseEntity{

    private  String name;
    private  Long price;
}
