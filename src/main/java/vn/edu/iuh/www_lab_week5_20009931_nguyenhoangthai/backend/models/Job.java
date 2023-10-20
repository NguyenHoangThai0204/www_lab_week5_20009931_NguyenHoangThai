package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;
@Entity
@Table(name = "job")
public class Job {
    @Id
    @Column(name = "job_id")
    private long jobId;

    @ManyToOne
    @JoinColumn(name = "com_id")
    private Company company;

    private String job_desc;
    private String job_name;

    public Job(long jobId, Company company, String job_desc, String job_name) {
        this.jobId = jobId;
        this.company = company;
        this.job_desc = job_desc;
        this.job_name = job_name;
    }

    public Job() {
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getJob_desc() {
        return job_desc;
    }

    public void setJob_desc(String job_desc) {
        this.job_desc = job_desc;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", company=" + company +
                ", job_desc='" + job_desc + '\'' +
                ", job_name='" + job_name + '\'' +
                '}';
    }
}
