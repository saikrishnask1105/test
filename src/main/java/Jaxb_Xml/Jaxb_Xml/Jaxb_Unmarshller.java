package Jaxb_Xml.Jaxb_Xml;
import java.io.File;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class Jaxb_Unmarshller {

	public static void main(String[] args) throws JAXBException, ClassNotFoundException, SQLException, IllegalArgumentException, IllegalAccessException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Jaxb_Xml\\src\\main\\java\\Jaxb_Xml\\Jaxb_Xml\\Emp.Xml");
		 JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeDetails.class);
         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
         EmployeeDetails employee = (EmployeeDetails) jaxbUnmarshaller.unmarshal(file);
         
        ArrayList<Employee> ar = employee.getlist();
        
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sai" , "postgres" , "postgres");
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO employeejaxb(\n" + " name,age,maritalstatus,designation)\n" + "values(?, ?, ?,?)\n");
		
		for (Employee employee1 : ar) 
		{
			int i = 1;
			Class<?> test = employee1.getClass();
			Field[] field = test.getDeclaredFields();
			for (Field filed : field) {
				filed.setAccessible(true);
				if (filed.getType() == int.class) {
					pstmt.setInt(i, filed.getInt(employee1));
					i++;
				} else {
					pstmt.setString(i, filed.get(employee1).toString());
					i++;
				}
			}
			pstmt.execute();
		
		
		
        
        
         
        

	}
	}

}
