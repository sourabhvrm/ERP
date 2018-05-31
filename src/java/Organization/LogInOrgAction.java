/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

import Config.SQLDB;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import controller.Login_Signup_ctrl;
/**
 *
 * @author Saurabh
 */
public class LogInOrgAction extends ActionSupport implements SessionAware {

    public static Login_Signup_ctrl ctrl=new Login_Signup_ctrl();
    String orgId;
    String orgPassword;
    private SessionMap<String, Object> sessionMap;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgPassword() {
        return orgPassword;
    }

    public void setOrgPassword(String orgPassword) {
        this.orgPassword = orgPassword;
    }

    public String execute() throws Exception {
        if (ctrl.Check_Org_Login(getOrgId(), getOrgPassword())) {
            String name=ctrl.Retrieve_Org_name_by_id(getOrgId());
            sessionMap.put("OrgName",name);
            sessionMap.put("OrgId",getOrgId());
            return SUCCESS;
        }
        addActionError("Error LogIn");
        return INPUT;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sessionMap = (SessionMap) map;
    }

    public String logOut() {
        sessionMap.invalidate();
        return SUCCESS;
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
