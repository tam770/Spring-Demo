package model;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerValidation
{
 @NotNull(message="is required")
 @Pattern(regexp="^[a-zA-z]{3,50}$",message="Enter only Character ")
 private String fname;
 
 @NotNull(message="is required")
 //@Size(min=1,message="is required")
 @Pattern(regexp="^[a-zA-z]{1,50}$",message="Enter only Character")
 private String lname;
 

 @NotNull(message="is required")
 @Min(value=0,message="Enter number greter zero or equal to ")
 @Max(value=1234567890,message="Enter number less 10 or equal to")
 //@Pattern(regexp="^[0-9]{10,10}$",message="Enter only 10 digit number")
 private Long contact;
 
 @NotNull(message="is required")
 @Pattern(regexp="^[a-zA-z0-9]{5}",message="Enter only 5 Char/digit")
 private String  postalcode;
 
 
public String getPostalcode() {
	return postalcode;
}

public void setPostalcode(String postalcode) {
	this.postalcode = postalcode;
}

public Long getContact() {
	return contact;
}

public void setContact(Long contact) {
	this.contact = contact;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}



}
