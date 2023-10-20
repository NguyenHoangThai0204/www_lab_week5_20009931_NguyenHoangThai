package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models.*;
@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "com_id")
    private long companId;

    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;
    private String web_url;

    public long getCompanId() {
        return companId;
    }

    public void setCompanId(long companId) {
        this.companId = companId;
    }

    public Company() {
    }

    @Override
    public String toString() {
        return "Company{" +
                "companId=" + companId +
                ", address=" + address +
                ", web_url='" + web_url + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", comp_name='" + comp_name + '\'' +
                ", about='" + about + '\'' +
                '}';
    }

    public Company(long companId, Address address, String web_url, String phone, String email, String comp_name, String about) {
        this.companId = companId;
        this.address = address;
        this.web_url = web_url;
        this.phone = phone;
        this.email = email;
        this.comp_name = comp_name;
        this.about = about;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    private String phone;
    private String email;
    private String comp_name;
    private String about;

}
