package ru.sakaev.project.module;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table
@Data
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Version
    private int version;

    private String name;

    @Column(name = "full_name")
    private String fullName;

    private int inn;

    private int kpp;

    private String address;

    private int phone;

    @Column(name = "is_active")
    private boolean isActive;


}
