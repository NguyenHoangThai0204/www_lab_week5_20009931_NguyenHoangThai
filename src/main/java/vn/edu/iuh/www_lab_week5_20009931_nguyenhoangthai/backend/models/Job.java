package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;
@Entity
@Table(name = "job")
public class Job {
    @Id
    @Column(name = "job_id")
    private long jobId;

    @Id
    @ManyToOne
    private Company company;

    private String job_desc;
    private String job_name;

}
