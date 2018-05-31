/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import static com.opensymphony.xwork2.Action.LOGIN;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import controller.Login_Signup_ctrl;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
/**
 *
 * @author Saurabh
 */
public class EmployeeLogInAction extends ActionSupport implements SessionAware{

    public static Login_Signup_ctrl ctrl=new Login_Signup_ctrl();
    private SessionMap<String, Object> sessionMap;
    String empEmailId;
    String password;
   // String orgId;

    public String getEmpEmailId() {
        return empEmailId;
    }

    public void setEmpEmailId(String empEmailId) {
        this.empEmailId = empEmailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
*/
   
/*
    @Override
    public void validate() {
        if (getEmpEmailId().equals("")) {
            addActionError("Enter Employee Email");
        }
        if (getPassword().equals("")) {
            addActionError("Enter Password");
        }
        if (getOrgId().equals("")) {
            addActionError("Enter Organisation Id");
        }
    }

*/

    @Override
    public String execute() throws Exception {
       if(ctrl.Check_Emp_Login(getEmpEmailId(), getPassword()))
       {
           String name=ctrl.Retrieve_empName_by_email(getEmpEmailId());
           sessionMap.put("empName",name);
           sessionMap.put("empEmailId",getEmpEmailId());
           return SUCCESS;
       }
        addActionError("Not Authorized");
        return INPUT;
    }
    
    public String logOut() {
        sessionMap.invalidate();
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sessionMap = (SessionMap) map;
    }
    
    /*
    public String sessionValidate() {
        System.out.println("Session Validate");
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if (session == null || session.getAttribute("login") == null) {
            return LOGIN;
        } else {
            return SUCCESS;
        }
    }*/

}
