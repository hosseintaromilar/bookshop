package com.asiastar.bookleaf.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Getter
@Setter
@Table(schema = SchemaName.SchemaName)
public class Book extends BaseEntity{

    private  String name;
    private  long price;
}
