package demo;

import java.io.IOException;
import java.io.PrintWriter;

import DAOImpl.EmployeeDAOImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Hi");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String department = req.getParameter("department");

      //  int age = Integer.parseInt(req.getParameter("age"));

        Employee emp = new Employee(name, email, address, department);

        EmployeeDAOImpl impl = new EmployeeDAOImpl();

       int res = impl.addEmployee(emp);

        PrintWriter out = resp.getWriter();
        
        if(res==1)
        out.println("Hey, " + name + " your registration is successful.. Address: " + address);
        else
        	 out.println("Hey, " + name + "something went wrong...");
    }
}  