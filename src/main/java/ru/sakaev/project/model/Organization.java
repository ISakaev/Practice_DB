package ru.sakaev.project.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
@Data
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Version
    @Column(name = "version", nullable = false)
    private int version;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "full_name", length = 150, nullable = false)
    private String fullName;

    @Column(name = "inn", length = 10, nullable = false)
    private String inn;

    @Column(name = "kpp", length = 10, nullable = false)
    private String kpp;

    @Column(name = "address", length = 150, nullable = false)
    private String address;

    @Column(name = "address", length = 20)
    private String phone;

    @Column(name = "is_active", length = 5)
    private boolean isActive;


}
