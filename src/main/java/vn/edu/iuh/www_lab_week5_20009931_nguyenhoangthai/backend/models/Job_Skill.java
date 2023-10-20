package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.enums.SkillLevel;

@Entity
@Table(name = "job_skill")
public class Job_Skill {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    private SkillLevel skill_level;
    private String more_infos;

    @Override
    public String toString() {
        return "Job_Skill{" +
                "job=" + job +
                ", skill=" + skill +
                ", skill_level=" + skill_level +
                ", more_infos='" + more_infos + '\'' +
                '}';
    }

    public Job_Skill() {
    }

    public Job_Skill(Job job, Skill skill, SkillLevel skill_level, String more_infos) {
        this.job = job;
        this.skill = skill;
        this.skill_level = skill_level;
        this.more_infos = more_infos;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public SkillLevel getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(SkillLevel skill_level) {
        this.skill_level = skill_level;
    }

    public String getMore_infos() {
        return more_infos;
    }

    public void setMore_infos(String more_infos) {
        this.more_infos = more_infos;
    }
}
