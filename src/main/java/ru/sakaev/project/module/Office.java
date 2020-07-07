package ru.sakaev.project.module;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Version
    private int version;

    private String name;

    private String address;

    private int phone;

    @Column(name = "org_id")
    private int organizationId;

    @Column(name = "is_active")
    private boolean isActive;
}
