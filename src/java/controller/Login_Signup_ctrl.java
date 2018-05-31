/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Config.SQLDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;


/**
 *
 * @author prince
 */
public class Login_Signup_ctrl {
    
    public  boolean Insert_to_Employee(String empName,String empAddress,String empMobile,String empDate,String empGender,String empEmail,String Password,String empOrgCode)
    {    System.out.println(empOrgCode);
        System.out.println(Integer.parseInt(empOrgCode));
        try{
            System.out.println("yahan");
            Connection connection=new SQLDB().getConnection();
            System.out.println("yahan bhi");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO erp.employee (`empName`,`empAddress`,`empMobNo`,`empJoiningDate`,`empGender`,`empEmailId`,`empPassword`,`empOrgCode`)"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?) ");
            statement.setString(1, empName);
            statement.setString(2, empAddress);
            statement.setLong(3, Long.parseLong(empMobile));
            statement.setString(4, empDate);
            statement.setString(5, empGender);
            statement.setString(6, empEmail);
            statement.setString(7, Password);
            statement.setInt(8, Integer.parseInt(empOrgCode));
            statement.executeUpdate();
            connection.close();
            
            return true;
            
        }catch(SQLException e)
        {
                       // Logger.getLogger(Login_Signup_ctrl.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        return false;
    }
    public boolean Insert_to_Org(String OrgName,String DateCreated,String Location,String OrgPass)
    {
        try{
            Connection connection=new SQLDB().getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO erp.organization (`orgName`, `dateCreated`, location, `orgPassword`) "
                    + "	VALUES (?, ?, ?, ?) ");
        
        statement.setString(1, OrgName);
            statement.setString(2, DateCreated);
            statement.setString(3, Location);
            statement.setString(4, OrgPass);
            statement.executeUpdate();
            connection.close();
            
            return true;
        
        }catch(SQLException e)
        {
            Logger.getLogger(Login_Signup_ctrl.class.getName()).log(Level.SEVERE, null, e);    
        }
        
        return false;
    }
    public boolean Check_Org_Login(String OrgId,String OrgPassword)
    {
        try {
            Connection connection = new SQLDB().getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM erp.Organization WHERE orgId=? AND orgPassword=?");
            statement.setInt(1, Integer.parseInt(OrgId));
            statement.setString(2, OrgPassword);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                System.out.println("Record Exist");
                connection.close();
                return true;
            }
            connection.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Login_Signup_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean Check_Emp_Login(String email,String pass)
    {
        try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT * FROM erp.employee WHERE empEmailId=? AND empPassword=?");
            statement.setString(1, email);
            statement.setString(2, pass);
            ResultSet rs=statement.executeQuery();
            if(rs.next()){
                System.out.println("Employee Exists");
                connection.close();
                return true;
            }
            connection.close();
            return false;
            }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public String Retrieve_Org_name_by_id(String OrgId)
    {
        try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT * FROM erp.organization WHERE orgId=?");
            statement.setInt(1, Integer.parseInt(OrgId));
            ResultSet rs=statement.executeQuery();
            if(rs.next())
            {
                return rs.getString(2);
                
            }
            connection.close();
            return "";
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return "";
    }
    public String Retrieve_empName_by_email(String email)
    {
        try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT empName FROM erp.employee WHERE empEmailId=?");
            statement.setString(1, email);
            ResultSet rs=statement.executeQuery();
            if(rs.next())
            {
                System.out.println(rs.getString(1));
                return rs.getString(1);
            }
            connection.close();
            return "";
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return "";
    }
    public ArrayList<String> Retrieve_Org_Names()
    {
        ArrayList<String> arr=new ArrayList<>();
        try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT orgname FROM erp.organization");
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
               arr.add(rs.getString(1));
            }
          connection.close();
          return arr;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return arr;
    }
    public int Find_income_YearWise(String Year,String OrgId)
    {
        int income=0;
        int i=0;
        try{
            
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT sum(amount) FROM erp.transactions WHERE type=? and year=? and OrgId=?");
            statement.setString(1, "income");
            statement.setString(2, Year);
            statement.setInt(3, Integer.parseInt(OrgId));
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                income=income+rs.getInt(1);
                i++;
            }
            System.out.println(income);
            connection.close();
            return income;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return income;
    }
    public int Find_expenditure_YearWise(String Year,String OrgId)
    {
        int expend=0;
        int i=0;
        try{
            
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT sum(amount) FROM erp.transactions WHERE type=? and year=? and OrgId=?");
            statement.setString(1, "expend");
            statement.setString(2, Year);
            statement.setInt(3, Integer.parseInt(OrgId));
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                expend=expend+rs.getInt(1);
                i++;
            }
            System.out.println(expend);
            connection.close();
            return expend;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return expend;
    }
    public int Find_investment_YearWise(String Year,String OrgId)
    {
        int invest=0;
        int i=0;
        try{
            
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT sum(amount) FROM erp.transactions WHERE type=? and year=? and OrgId=?");
            statement.setString(1, "invest");
            statement.setString(2, Year);
            statement.setInt(3, Integer.parseInt(OrgId));
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                invest=invest+rs.getInt(1);
                i++;
            }
            System.out.println(invest);
            connection.close();
            return invest;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return invest;
    }
    public int Find_Profit_YearWise(String Year,String OrgId)
    {
        int profit=0;
        //int salary_expend=0;
        int income=0;
        int expenditure=0;
        try{
            
            Connection connection=new SQLDB().getConnection();
          
            PreparedStatement statement=connection.prepareStatement("SELECT sum(Amount) FROM erp.transactions WHERE OrgId=? and year=? and type=?");
            statement.setInt(1, Integer.parseInt(OrgId));
            statement.setString(2, Year);
            statement.setString(3, "expend");
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
              expenditure=expenditure+rs.getInt(1);
            }
            System.out.println(expenditure);
            
            statement=connection.prepareStatement("SELECT sum(Amount) FROM erp.transactions WHERE OrgId=? and year=? and type=?");
            statement.setInt(1, Integer.parseInt(OrgId));
            statement.setString(2, Year);
            statement.setString(3, "income");
            rs=statement.executeQuery();
            while(rs.next())
            {
                income=income+rs.getInt(1);
            }            
            System.out.println(income);
            profit=income-(expenditure);
            System.out.println(profit);
            connection.close();
            return profit;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return profit;
    }
    public int Find_Salaries_of_employees(String OrgId)
    {
        int salary_expend=0;
        try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT sum(Amt) FROM erp.salary WHERE OrgId=?");           
            statement.setInt(1, Integer.parseInt(OrgId));
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                salary_expend=salary_expend+rs.getInt(1);
            }
            System.out.println(salary_expend);
            connection.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return salary_expend;
    }
    public HashMap<String,String> Personal_info_employee(String email)
    {
        HashMap<String,String> map=new HashMap<>();
        try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT `empName`,`empAddress`,`empMobNo`,`empJoiningDate`,`empGender`,`empEmailId` FROM erp.employee WHERE empemailid=?");
            statement.setString(1, email);
            ResultSet rs=statement.executeQuery();
            if(rs.next())
            {
                    map.put("name",rs.getString(1));
                  map.put("address",rs.getString(2));
                  map.put("phone",rs.getString(3));
                  map.put("JoiningDate",rs.getString(4));
                  map.put("gender",rs.getString(5));
                  map.put("emailId",rs.getString(6));    
            }
            connection.close();
            return map;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return map;
    }
    public int Salary(String email)
    { int salary=0;
        try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT empId FROM erp.employee WHERE empemailid=?");
            statement.setString(1, email);
            ResultSet rs=statement.executeQuery();
            if(rs.next())
            {
                System.out.println(rs.getInt(1));
                salary=Salary_util(rs.getInt(1), connection);
                return salary;
            }
            
            System.out.println("salary = "+salary);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return salary;
    }
    public int Salary_util(int id,Connection conn)
    {
        try{
            PreparedStatement stmt=conn.prepareStatement("SELECT `Amt` from erp.salary where empid=?");
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
            {
                return rs.getInt(1);
            }
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return 0;
    }
    public boolean Add_department(String OrgId,String Dept_name)
    {
        try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("INSERT INTO erp.department(`orgId`,`deptName`) VALUES(?,?)");
            statement.setInt(1, Integer.parseInt(OrgId));
            statement.setString(2, Dept_name);
            statement.executeUpdate();
            connection.close();
            return true;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
   public List<String> Retrieve_Departments(String OrgId)
   {
       List<String> list=new ArrayList<>();
       
       try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement statement=connection.prepareStatement("SELECT `deptName` from erp.department WHERE OrgId=?");
            statement.setInt(1, Integer.parseInt(OrgId));
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                list.add(rs.getString(1));
            }
            connection.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return list;
   }
   public boolean ADD_Project(String ProjectName,String OrgId)
   {
       try{
            Connection connection=new SQLDB().getConnection();
            PreparedStatement Statement=connection.prepareStatement("INSERT INTO erp.projects(`OrgId`,`ProjectName`) VALUES(?,?)");
            Statement.setInt(1, Integer.parseInt(OrgId));
            Statement.setString(2, ProjectName);
            Statement.executeUpdate();
            connection.close();
            return true;
       }catch(SQLException e)
       {
           e.printStackTrace();
       }
       return false;
   }
   
   public boolean ASSIGN_Project(String email,String ProjectName,String OrgId)
   {
       try{
           Connection connection=new SQLDB().getConnection();
           PreparedStatement stmt=connection.prepareStatement("SELECT `ProjectID` from erp.projects WHERE projectName=? and OrgId=?");
           stmt.setString(1, ProjectName);
           stmt.setInt(2, Integer.parseInt(OrgId));
           ResultSet rs=stmt.executeQuery();
           int id=0;
           if(rs.next())
           {
               id=rs.getInt(1);
           }
           stmt=connection.prepareStatement("UPDATE erp.employee SET empProjectId=? WHERE empEmailId=?");
           stmt.setInt(1, id);
           stmt.setString(2, email);
           stmt.executeUpdate();
           connection.close();
           return true;
       }catch(SQLException e)
       {
           e.printStackTrace();
       }
       return false;
   }
   
   /*
     select projects.projectname from projects
   inner join employee on employee.empprojectid=projects.projectid where empemailid="kldpsngh83@gmail.com";
   */
   public String Fetch_project(String email)
   {   try
       {
           Connection connection=new SQLDB().getConnection();
           PreparedStatement stmt=connection.prepareStatement("SELECT projects.projectName from erp.projects inner join erp.employee on employee.empprojectid=projects.projectid where empemailid=?");
           stmt.setString(1, email);
           ResultSet rs=stmt.executeQuery();
           if(rs.next())
           {
               return rs.getString(1);
           }
           connection.close();
       }
       catch(SQLException e)
       {
           e.printStackTrace();
       }
       return "";
   }
   public boolean Add_Transaction(String Amount,String Date,String year,String type,String Orgid)
   {
       try{
           Connection connection=new SQLDB().getConnection();
           PreparedStatement stmt=connection.prepareStatement("INSERT into erp.transactions(`Amount`,`Type`,`OrgId`,`Date`,`Year`) VALUES(?,?,?,?,?) ");
           stmt.setInt(1, Integer.parseInt(Amount));
           stmt.setString(2, type);
           stmt.setInt(3, Integer.parseInt(Orgid));
           stmt.setString(4, Date);
           stmt.setString(5, year);
           stmt.executeUpdate();
           connection.close();
           return true;
       }catch(SQLException e)
       {
           e.printStackTrace();
       }
       return false;
   }
   public ArrayList<String> All_projects_in_org(String OrgId)
   {
       ArrayList<String> list=new ArrayList<>();
       try{
           Connection connection=new SQLDB().getConnection();
           PreparedStatement stmt=connection.prepareStatement("SELECT ProjectName from erp.projects WHERE OrgId=?");
           stmt.setInt(1, Integer.parseInt(OrgId));
           ResultSet rs=stmt.executeQuery();
           while(rs.next())
           {
               list.add(rs.getString(1));
           }
           connection.close();
           return list;
       }catch(SQLException e)
       {
           e.printStackTrace();
       }
       return list;
   }
    
}
