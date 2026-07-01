package main.java.edu.cit.inosanto.springBackend.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "rental_owners")
@PrimaryKeyJoinColumn(name = "user_id")
public class RentalOwner extends User {

    private String businessName;

    private String contactNumber;

    private String businessAddress;

    public RentalOwner() {}

    public RentalOwner(String firstname, String middlename, String lastname,
                       String email, String password,
                       String businessName, String contactNumber, String businessAddress) {
        super(firstname, middlename, lastname, email, password);
        this.businessName = businessName;
        this.contactNumber = contactNumber;
        this.businessAddress = businessAddress;
    }

    public String getBusinessName() { return businessName; }
    public void setBusinessName(String businessName) { this.businessName = businessName; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getBusinessAddress() { return businessAddress; }
    public void setBusinessAddress(String businessAddress) { this.businessAddress = businessAddress; }
}

