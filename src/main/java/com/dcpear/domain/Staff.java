package com.dcpear.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "StaffDemo")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Staff {
    @Column(name ="person_name")
    private String person_name;
    @Column(name ="id")
    private String id;
    @Column(name = "department")
    private String department;
    @Column(name = "floor")
    private int floor;
    @Column(name = "manager")
    private String manager;
}
