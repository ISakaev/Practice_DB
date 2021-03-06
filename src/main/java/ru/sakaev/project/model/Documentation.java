package ru.sakaev.project.module;


import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Documentation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Version
        @Column(name = "version", nullable = false)
        private int version;

        @Column(name = "code", nullable = false)
        private int code;

        @Column(name = "number", length = 50, nullable = false)
        private String number;

}