
public class Customer {
  private int custId;
  private String custName;
  private String mobno;
  private Product prod[];
  private Address addr;
  private Bill bill;

public Customer(int custId, String custName, String mobno, Product[] prod, Address addr) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.mobno = mobno;
	this.prod = prod;
	this.addr = addr;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}
public Product[] getProd() {
	return prod;
}
public void setProd(Product[] prod) {
	this.prod = prod;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
public Bill getBill() {
	return bill;
}
public void setBill(Bill bill) {
	this.bill = bill;
}
  
}
