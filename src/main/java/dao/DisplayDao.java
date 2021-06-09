package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Application;
import utilty.JdbcConnection;

public class DisplayDao {
	Connection conn = null;
    PreparedStatement pstmt = null;
    Statement st = null;
    ResultSet rs = null;
	
    public List<Application> AllProfile() {
		
		List<Application> userList = new ArrayList<Application>();
		
		JdbcConnection dbConnection = new JdbcConnection();

        final String SQL_QUERY = "select * from form WHERE email IS NOT NULL";
		
        try {
        	conn = dbConnection.getConnection();
			pstmt = conn.prepareStatement(SQL_QUERY);
			
			rs = pstmt.executeQuery();
			
			 while (rs.next()) {
	                Application appli = new Application();
	                
	                appli.setEmail(rs.getString("email"));
	                appli.setFirtsname(rs.getString("firstname"));
	                appli.setLastsname(rs.getString("lastname"));
	                appli.setPhonenumber(rs.getString("phoneno"));
	                appli.setCurrentlocation(rs.getString("currentlocation"));
	                appli.setApplicaiondate(rs.getString("applicationdate"));
	                appli.setExperience(rs.getString("experience"));
	                appli.setMid(rs.getString("mid"));
	                appli.setNoiceperiod(rs.getString("noticeperiod"));
//	                prof.setFile((InputStream) rs.getBlob("photo"));
	                
	                userList.add(appli);
			 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        
        
		
		return userList;
	}
	
}

