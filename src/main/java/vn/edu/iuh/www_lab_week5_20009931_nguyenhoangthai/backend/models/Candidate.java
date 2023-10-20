package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @Column(name = "can_id")
    private long canId;

    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;
    private String full_name;
    private String email;
    private String phone;
    private Date dob;

    @OneToMany
    @JoinColumn(name = "can_id")
    private List<CandidateSkill> candidateSkills;

    public Candidate() {

    }

    public long getCanId() {
        return canId;
    }

    public void setCanId(long canId) {
        this.canId = canId;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "canId=" + canId +
                ", address=" + address +
                ", full_name='" + full_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dob=" + dob +
                '}';
    }

    public Candidate(long canId, Address address, String full_name, String email, String phone, Date dob) {
        this.canId = canId;
        this.address = address;
        this.full_name = full_name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
