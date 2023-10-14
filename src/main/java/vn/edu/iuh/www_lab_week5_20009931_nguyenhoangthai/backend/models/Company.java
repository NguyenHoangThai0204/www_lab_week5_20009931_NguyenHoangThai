package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models.*;
@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "com_id")
    private long companId;

    @Id
    private Address address;
    private String web_url;
    private String phone;
    private String email;
    private String comp_name;
    private String about;

}
