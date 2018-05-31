/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content_Loaders;

import com.opensymphony.xwork2.ActionSupport;
import controller.Login_Signup_ctrl;
import java.util.ArrayList;
/**
 *
 * @author prince
 */
public class select_choices_loader extends ActionSupport {
    public Login_Signup_ctrl ctrl=new Login_Signup_ctrl();
    ArrayList<String> arr;

    public ArrayList<String> getArr() {
        return arr;
    }
    public String Load_ORG()
    {
        arr=ctrl.Retrieve_Org_Names();
        System.out.println(arr.get(1));
        return SUCCESS;
    }
    public String execute()
    {
        return "";
    }
    
}
