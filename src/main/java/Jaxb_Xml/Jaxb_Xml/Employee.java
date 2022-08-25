package Jaxb_Xml.Jaxb_Xml;

import java.io.File;
import jakarta.xml.bind.annotation.XmlRootElement;
public class Employee 
{
	  private String name ;
	  private int age ;
	  private String maritalStatus ;
	  private String designation ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", maritalStatus=" + maritalStatus + ", designation="
				+ designation + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getMaritalStatus()="
				+ getMaritalStatus() + ", getDesignation()=" + getDesignation() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	  
	  
	  
    
  
}
