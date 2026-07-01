package main.java.edu.cit.inosanto.springBackend.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Customer extends User {

    private String phoneNumber;

    private String address;

    public Customer() {}

    public Customer(String firstname, String middlename, String lastname,
                    String email, String password,
                    String phoneNumber, String address) {
        super(firstname, middlename, lastname, email, password);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}