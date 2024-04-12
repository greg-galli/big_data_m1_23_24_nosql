package fr.miage.m1.big_data_m1_23_24_test_bd.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder @ToString
@Table
public class User {

//    private String id;

    @Id
    @PrimaryKey
    private UUID uuid;

    private String name;

}
