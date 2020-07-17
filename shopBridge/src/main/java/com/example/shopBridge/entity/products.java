package com.example.shopBridge.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class products {
	@Id
	@GeneratedValue
	private int Pid;
	private String PName;
	private String PCategory;
	private Long Price;
	private String PDescription;
	private String PBrand;
	
	
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPBrand() {
		return PBrand;
	}
	public void setPBrand(String pBrand) {
		PBrand = pBrand;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getPCategory() {
		return PCategory;
	}
	public void setPCategory(String pCategory) {
		PCategory = pCategory;
	}
	public Long getPrice() {
		return Price;
	}
	public void setPrice(Long price) {
		Price = price;
	}
	public String getPDescription() {
		return PDescription;
	}
	public void setPDescription(String pDescription) {
		PDescription = pDescription;
	}
	@Override
	public String toString() {
		return "products [Pid=" + Pid + ", PName=" + PName + ", PCategory=" + PCategory + ", Price=" + Price
				+ ", PDescription=" + PDescription + ", PBrand=" + PBrand + "]";
	}
}
