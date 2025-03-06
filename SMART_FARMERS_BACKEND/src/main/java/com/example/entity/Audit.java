package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Audit")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="action_id")
    public int actionId;

    @Column(name="date")
    public Date date;

    @Column(name="record_id") //
    public int recordId;

    @Column(name="action_name")
    public String actionName;

    @Column(name="description")
    public String description;

    @Column(name="table_name")
    public String tableName;




    public enum actionName{
        CREATE,EDIT,DELETE ,READ
    }

//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user; // Link to User (Farmer or Provider)



}
