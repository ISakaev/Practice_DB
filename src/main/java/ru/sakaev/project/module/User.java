package ru.sakaev.project.module;

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
    private int version;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    private String position;

    private int phone;

    @Column(name = "doc_code")
    private int docCode;

    @Column(name = "doc_number")
    private int docNumber;

    @Column(name = "doc_date")
    private Date docDate;

    @Column(name = "citizenship_code")
    private int citizenshipCode;

    @Column(name = "office_id")
    private int officeId;

    @Column(name = "is_identified")
    private boolean isIdentified;

}
