/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

import com.opensymphony.xwork2.ActionSupport;
import controller.Login_Signup_ctrl;

/**
 *
 * @author Saurabh
 */
public class CreateOrgAction extends ActionSupport {

    public static Login_Signup_ctrl ctrl=new Login_Signup_ctrl();
    String orgName;
    String location;
    String dateCreated;
    String orgPassword;
    String cnfPassword;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getOrgPassword() {
        return orgPassword;
    }

    public void setOrgPassword(String orgPassword) {
        this.orgPassword = orgPassword;
    }

    public String getCnfPassword() {
        return cnfPassword;
    }

    public void setCnfPassword(String cnfPassword) {
        this.cnfPassword = cnfPassword;
    }

    @Override
    public void validate() {
        if (getOrgPassword().equals("")) {
            addActionError("Enter Password");
        } else {
            if (!getOrgPassword().equals(getCnfPassword())) {
                addActionError("Passwords Does not Match");
            }
        }
    }

    @Override
    public String execute() throws Exception {
        System.out.println("Execute Org");
        if (ctrl.Insert_to_Org(getOrgName(), getDateCreated(), getLocation(), getOrgPassword())) {
            return SUCCESS;
        }
        return INPUT;
    }

   
}
