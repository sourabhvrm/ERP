/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import controller.Login_Signup_ctrl;
import java.util.HashMap;
import org.apache.struts2.dispatcher.SessionMap;

/**
 *
 * @author prince
 */
public class Employee_operations extends ActionSupport{
    Login_Signup_ctrl ctrl=new Login_Signup_ctrl();
    String name="Not provided";
    String email="Not provided";
    String Phone="Not provided";
    String sex="Not provided";
    String address="Not provided";
    String Joining_date="Not provided";
    String Salary="Not provided";
    String Project;

    public String getProject() {
        return Project;
    }

    public String getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getJoining_date() {
        return Joining_date;
    }
    public String execute()
    {
        return "";
    }
    public String Personal_info()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        HashMap<String,String> map;
        map=ctrl.Personal_info_employee((String)session.get("empEmailId"));
        /*
        
          map.put("name",rs.getString(1));
                  map.put("address",rs.getString(2));
                  map.put("phone",rs.getString(3));
                  map.put("JoiningDate",rs.getString(4));
                  map.put("gender",rs.getString(5));
                  map.put("emailId",rs.getString(6));
        */
        if(map.containsKey("name"))
            name=map.get("name");
        
        if(map.containsKey("address"))
            address=map.get("address");
        
        if(map.containsKey("phone"))
            Phone=map.get("phone");
        
        if(map.containsKey("JoiningDate"))
            Joining_date=map.get("JoiningDate");
        
        if(map.containsKey("gender"))
            sex=map.get("gender");
        
        if(map.containsKey("emailId"))
            email=map.get("emailId");
        
        return SUCCESS;
                    
    }
    public String salary_emp()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        int salary=ctrl.Salary((String)session.get("empEmailId"));
        if(salary!=0)
        {
          Salary=Integer.toString(salary);   
        }
        return SUCCESS;
    }
    public String Fetch_Project()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        Project=ctrl.Fetch_project((String)session.get("empEmailId"));
        if(Project.equals(""))
        {
            addActionError("Error Fetching");
            Project="Not Assigned anything yet";
        }
        return SUCCESS;
    }
}
