package com.example.eCommerce.Module;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String orderNo;
    int totalValue;
    @CreationTimestamp
    Date orderdate;

   String cardUsed;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    List<Items> item = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    Customer customer;

}
