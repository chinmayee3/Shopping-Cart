
public class Address {
   private String ct;
   private String st;
   private int pincode;
public Address(String ct, String st, int pincode) {
	super();
	this.ct = ct;
	this.st = st;
	this.pincode = pincode;
}
public String getCt() {
	return ct;
}
public void setCt(String ct) {
	this.ct = ct;
}
public String getSt() {
	return st;
}
public void setSt(String st) {
	this.st = st;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
   
}
