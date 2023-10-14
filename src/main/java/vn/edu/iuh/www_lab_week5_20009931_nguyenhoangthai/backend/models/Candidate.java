package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "can_id")
public class Candidate {
    @Id
    @Column(name = "can_id")
    private long canId;
    @Id
    @OneToOne
    private Address address;
    private String full_name;
    private String email;
    private String phone;
    private Date dob;
}
