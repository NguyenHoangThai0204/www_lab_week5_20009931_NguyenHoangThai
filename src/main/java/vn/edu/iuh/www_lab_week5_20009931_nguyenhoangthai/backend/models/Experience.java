package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @Column(name = "exp_id")
    private long expId;
    @Id
    @OneToOne
    private Candidate candidate;
    private String work_desc;
    private String company;
    private String role;
    private Date to_date;
    private Date from_date;
}
