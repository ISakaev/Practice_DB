package ru.sakaev.project.module;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Doc {

    @Id
    private int id;

    @Version
    @Column(name = "version", nullable = false)
    private int version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Documentation documentation;

    @Column(name = "number", length = 20)
    private String number;

    @Column(name = "date", length = 20)
    private String date;
}
