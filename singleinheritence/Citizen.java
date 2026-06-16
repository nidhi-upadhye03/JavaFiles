package com.tns.singleinheritence;

public class Citizen {
	private String name;
	private String aadharNo;;
	private String Address;
	private long Phno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		Phno = phno;
	}
	public Citizen()
	{
		System.out.print("Im a default constructor");
	}
	public Citizen(String name, String aadharNo, String address, long phno) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		Address = address;
		Phno = phno;
	}
	@Override
    public String toString() {
        return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + Address + ", phno=" + Phno + "]";
    }
}
