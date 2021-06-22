package Auxiliry;

public class Customer {
	private Integer cId;
	private String customerNameString;
	
	public Customer(Integer cCId, String cCustomerNameString)
	{
		setcId(cCId);
		setCustomerNameString(cCustomerNameString);
		
	}
	
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getCustomerNameString() {
		return customerNameString;
	}
	public void setCustomerNameString(String customerNameString) {
		this.customerNameString = customerNameString;
	}
	
}
