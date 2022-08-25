package Jaxb_Xml.Jaxb_Xml;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EmployeeDetails")
public class EmployeeDetails
{
	@XmlElement(name = "Employee")
	private ArrayList<Employee> list  = new ArrayList<>() ;
	
	public ArrayList<Employee> getlist()
	{
		return list;
	}
}