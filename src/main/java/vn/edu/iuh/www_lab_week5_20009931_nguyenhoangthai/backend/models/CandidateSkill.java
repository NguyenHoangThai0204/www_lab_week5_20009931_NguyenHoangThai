package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.enums.SkillLevel;

@Entity
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Id
    @OneToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    private SkillLevel skillLevel;
    private String moreInfo;

    @Override
    public String toString() {
        return "CandidateSkill{" +
                "skill=" + skill +
                ", candidate=" + candidate +
                ", skillLevel=" + skillLevel +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }

    public Skill getSkill() {
        return skill;
    }

    public CandidateSkill() {
    }

    public CandidateSkill(Skill skill, Candidate candidate, SkillLevel skillLevel, String moreInfo) {
        this.skill = skill;
        this.candidate = candidate;
        this.skillLevel = skillLevel;
        this.moreInfo = moreInfo;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public SkillLevel getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(SkillLevel skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }
}
