package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Id
    @OneToOne
    private Skill skill;
    @Id
    @ManyToOne
    private Candidate candidate;

}
