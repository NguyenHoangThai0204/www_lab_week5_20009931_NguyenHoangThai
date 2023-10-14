package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_skill")
public class Job_Skill {
    @Id
    @ManyToOne
    private Job job;
    @Id
    @ManyToOne
    private Skill skill;
    private int skill_level;
    private String more_infos;

}
