package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @Column(name = "skill_id")
    private long skillId;
    private String skill_desc;
    private String skill_name;
    private String skill_type;

}
