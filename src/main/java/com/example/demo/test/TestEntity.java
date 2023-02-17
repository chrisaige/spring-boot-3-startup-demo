package com.example.demo.test;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "TEST")
public class TestEntity {

    @Id
    @Column(name = "ID", nullable = false, precision = 11, columnDefinition = "NUMBER(11)")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "key_value_sequence")
    @SequenceGenerator(name = "key_value_sequence", sequenceName = "INV_OFA_KEY_VALUE_ID_SEQ0", allocationSize = 1)
    private Long id;

    @Column(name = "KEY", length = 1, nullable = false, columnDefinition = "CHAR")
    private Character key;

    @Column(name = "VALUE", length = 100, nullable = false, columnDefinition = "VARCHAR2(100 CHAR)")
    private String value;
}
