/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import controller.Login_Signup_ctrl;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.dispatcher.SessionMap;
/**
 *
 * @author prince
 */
public class Organization_operations extends ActionSupport {
    Login_Signup_ctrl ctrl=new Login_Signup_ctrl();
    String year;
    String income="";
    String expend="";
    String invest="";
    String Profit="";
    String Tax="";
    String Dept_name;
    String project_name;
    String emp_email;
    String project_assigned;
    String transtype;
    String transamount;
    String transDate;
    String transYear;
    ArrayList<String> pro;

    public ArrayList<String> getPro() {
        return pro;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getTransamount() {
        return transamount;
    }

    public void setTransamount(String transamount) {
        this.transamount = transamount;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransYear() {
        return transYear;
    }

    public void setTransYear(String transYear) {
        this.transYear = transYear;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getProject_assigned() {
        return project_assigned;
    }

    public void setProject_assigned(String project_assigned) {
        this.project_assigned = project_assigned;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
    List<String> list_dept;

    public List<String> getList_dept() {
        return list_dept;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String Dept_name) {
        this.Dept_name = Dept_name;
    }
    
    public String getTax() {
        return Tax;
    }
    
     
    public String getProfit() {
        return Profit;
    }
   

    public String getExpend() {
        return expend;
    }

    public String getInvest() {
        return invest;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getIncome()
    {
        return income;
    }
    
    public String execute()
    {
        return "";
    }
    public String Find_income()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        int temp=ctrl.Find_income_YearWise(getYear(), (String)session.get("OrgId"));
        if(temp==0)
        {
            income="NO Income in the year provided";
        }
        else
        {
            income=Integer.toString(temp);
        }
            return SUCCESS;
    }
    public String Find_Expenditure()
    {
       SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        int temp=ctrl.Find_expenditure_YearWise(getYear(), (String)session.get("OrgId"));
        if(temp==0)
        {
            expend="NO Expenditure in the year provided";
        }
        else
        {
            expend=Integer.toString(temp);
        }
            return SUCCESS;   
    }
    public String Find_Investment()
    {
      SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        int temp=ctrl.Find_investment_YearWise(getYear(), (String)session.get("OrgId"));
        if(temp==0)
        {
            invest="NO Investment in the year provided";
        }
        else
        {
            invest=Integer.toString(temp);
        }
            return SUCCESS;   
    }
    public String Find_Profit()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        int temp=ctrl.Find_Profit_YearWise(getYear(), (String)session.get("OrgId"));
           Profit=Integer.toString(temp);   
            return SUCCESS;
    }
    public String Find_tax()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        int temp=ctrl.Find_income_YearWise(getYear(),(String)session.get("OrgId"));
        if(temp==0)
        {
            Tax="No tax in this Year as there is no income earned";
        }
        else
        {
            Tax=Double.toString(temp-(0.95*temp));
        }
        return SUCCESS;
    }
    public String Balance()
    {
       SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        int temp=ctrl.Find_income_YearWise(getYear(), (String)session.get("OrgId"));
        if(temp==0)
        {
            income="NO Income in the year provided";
            Tax="No tax in this Year as there is no income earned";
        }
        else
        {
            income=Integer.toString(temp);
             Tax=Double.toString(temp-(0.95*temp));
        }
        
        temp=ctrl.Find_expenditure_YearWise(getYear(), (String)session.get("OrgId"));
        if(temp==0)
        {
            expend="NO Expenditure in the year provided";
        }
        else
        {
            expend=Integer.toString(temp);
        }
         temp=ctrl.Find_investment_YearWise(getYear(), (String)session.get("OrgId"));
        if(temp==0)
        {
            invest="NO Investment in the year provided";
        }
        else
        {
            invest=Integer.toString(temp);
        }
        
        temp=ctrl.Find_Profit_YearWise(getYear(), (String)session.get("OrgId"));
           Profit=Integer.toString(temp);
           
           return SUCCESS;
    }
    public String Add_Dept()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        if(ctrl.Add_department((String)session.get("OrgId"),getDept_name()))
        {
            return SUCCESS;
        }
        addActionError("Error Creating");
        return SUCCESS;
    }
    public String All_Dept_By_OrgId()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        list_dept=ctrl.Retrieve_Departments((String)session.get("OrgId"));
        if(list_dept!=null)
        {
            System.out.println(list_dept.get(0));
            return SUCCESS;
        }
        addActionError("ERROR Fetching");
        return SUCCESS;
    }
    public String Add_Project()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        if(ctrl.ADD_Project(getProject_name(),(String)session.get("OrgId")))
        {
            addActionMessage("Project Added");
            return SUCCESS;
        }
        addActionError("Project did not add");
        return SUCCESS;
    }
    public String Assign_Project()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        if(ctrl.ASSIGN_Project(getEmp_email(), getProject_assigned(),(String)session.get("OrgId")))
        {
            addActionMessage("Project Assigned");
            return SUCCESS;
        }
        addActionError("Project did not assigned");
        return SUCCESS;
    }
    public String Add_transaction()
    {
         SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
         if(ctrl.Add_Transaction(getTransamount(), getTransDate(), getTransYear(), getTranstype(),(String)session.get("OrgId")))
         {
             addActionMessage("Transaction Added");
             return SUCCESS;
         }
         addActionError("Transaction did not add");
        return SUCCESS;
    }
    public String All_Projects_in_org()
    {
        SessionMap<String,Object> session = (SessionMap)(ActionContext.getContext().getSession());
        pro=ctrl.All_projects_in_org((String)session.get("OrgId"));
        return SUCCESS;
    }
}
