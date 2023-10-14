package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.enums.Country;
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "add_id")
    private long addressId;
    private Country country;
    private String city;
    private String street;
    private String number;
    private String zipcode;


}
