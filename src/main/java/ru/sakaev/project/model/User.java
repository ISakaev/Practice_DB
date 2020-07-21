package ru.sakaev.project.module;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Version
    @Column(name = "version", nullable = false)
    private int version;

    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @Column(name = "middle_name", length = 20)
    private String middleName;

    @Column(name = "position", length = 20, nullable = false)
    private String position;

    @Column(name = "phone", length = 20)
    private String phone;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Doc doc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id")
    private Office office;

    @Column(name = "is_identified")
    private boolean isIdentified;

}
