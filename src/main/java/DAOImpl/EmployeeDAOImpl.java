package DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import demo.Employee;
import demo.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/adv_java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String INSERT_QUERY="INSERT into employee (name,email,department,address) " 
    + "values(?,?,?,?)";

    @Override
    public int addEmployee(Employee emp) {
    	
    		int res=0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
           PreparedStatement pstmt=con.prepareStatement(INSERT_QUERY);
           
           
           pstmt.setString(1, emp.getName());
           pstmt.setString(2, emp.getEmail());
           pstmt.setString(3, emp.getDepartment());
           pstmt.setString(4, emp.getAddress());
         //  pstmt.setInt(6, emp.getAge()); 
           
           res=pstmt.executeUpdate();
          // System.out.println(res);
           
           
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return res; 
    }
}