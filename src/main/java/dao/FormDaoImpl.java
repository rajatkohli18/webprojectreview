package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Application;
import utilty.JdbcConnection;



public class FormDaoImpl {

	public String RegisterData(Application application) {

		try {

			Connection conn = JdbcConnection.getConnection();
			
			PreparedStatement preparestatement = conn.prepareStatement("INSERT INTO form (email,firstname,lastname,phoneno,currentlocation,applicationdate,experience,mid,noticeperiod,resumepath) VALUES (?,?,?,?,?,?,?,?,?,?)");

			preparestatement.setString(1, application.getEmail());
			preparestatement.setString(2, application.getFirtsname());
			preparestatement.setString(3, application.getLastsname());
			preparestatement.setString(4, application.getPhonenumber());
			preparestatement.setString(5, application.getCurrentlocation());
			preparestatement.setString(6, application.getApplicaiondate());
			preparestatement.setString(7, application.getExperience());
			preparestatement.setString(8, application.getMid());
			preparestatement.setString(9, application.getNoiceperiod());
			preparestatement.setString(10, application.getPhonenumber());

			int affectedRows = preparestatement.executeUpdate();
			
			if (affectedRows>0) {
				return "Data added Successfully!!!";
			}

		} catch (SQLException SQLIntegrityConstraintViolationException) {
		      	System.out.println("Duplicate Entry!");
		}
		return "Problem while Registering into Database!";
	}
	
}
