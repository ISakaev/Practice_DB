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
    @Column(name = "version", nullable = false)
    private int version;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "address", length = 20)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Organization organization;

    @Column(name = "is_active", length = 5)
    private String isActive;
}
