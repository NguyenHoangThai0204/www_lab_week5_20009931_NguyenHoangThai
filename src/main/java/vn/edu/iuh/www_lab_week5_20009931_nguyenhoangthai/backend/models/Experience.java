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
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    private String work_desc;
    private String company;
    private String role;
    private Date to_date;
    private Date from_date;

    @Override
    public String toString() {
        return "Experience{" +
                "expId=" + expId +
                ", candidate=" + candidate +
                ", work_desc='" + work_desc + '\'' +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", to_date=" + to_date +
                ", from_date=" + from_date +
                '}';
    }

    public Experience() {
    }

    public Experience(long expId, Candidate candidate, String work_desc, String company, String role, Date to_date, Date from_date) {
        this.expId = expId;
        this.candidate = candidate;
        this.work_desc = work_desc;
        this.company = company;
        this.role = role;
        this.to_date = to_date;
        this.from_date = from_date;
    }

    public long getExpId() {
        return expId;
    }

    public void setExpId(long expId) {
        this.expId = expId;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getWork_desc() {
        return work_desc;
    }

    public void setWork_desc(String work_desc) {
        this.work_desc = work_desc;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }
}
