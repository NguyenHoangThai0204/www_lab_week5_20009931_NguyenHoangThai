package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.enums.SkillStype;

import java.util.List;

@Entity
@Table(name = "skill")
public class Skill {
    @Override
    public String toString() {
        return "Skill{" +
                "skillId=" + skillId +
                ", skill_desc='" + skill_desc + '\'' +
                ", skill_name='" + skill_name + '\'' +
                ", skill_type=" + skill_type +
                ", jobSkills=" + jobSkills +
                '}';
    }

    @Id
    @Column(name = "skill_id")
    private long skillId;
    private String skill_desc;
    private String skill_name;
    private SkillStype skill_type;

    public Skill() {
    }

    public long getSkillId() {
        return skillId;
    }

    public void setSkillId(long skillId) {
        this.skillId = skillId;
    }

    public String getSkill_desc() {
        return skill_desc;
    }

    public void setSkill_desc(String skill_desc) {
        this.skill_desc = skill_desc;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public SkillStype getSkill_type() {
        return skill_type;
    }

    public void setSkill_type(SkillStype skill_type) {
        this.skill_type = skill_type;
    }

    public List<Job_Skill> getJobSkills() {
        return jobSkills;
    }

    public void setJobSkills(List<Job_Skill> jobSkills) {
        this.jobSkills = jobSkills;
    }

    @OneToMany
    @JoinColumn(name = "job_id")
    private List<Job_Skill> jobSkills;

    public Skill(long skillId, String skill_desc, String skill_name, SkillStype skill_type, List<Job_Skill> jobSkills) {
        this.skillId = skillId;
        this.skill_desc = skill_desc;
        this.skill_name = skill_name;
        this.skill_type = skill_type;
        this.jobSkills = jobSkills;
    }
}
