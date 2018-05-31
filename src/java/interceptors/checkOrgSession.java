/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.dispatcher.SessionMap;

/**
 *
 * @author prince
 */
public class checkOrgSession implements Interceptor{

    @Override
    public void destroy() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
       // ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       SessionMap<String,Object> sessionMap=(SessionMap)(ai.getInvocationContext().getSession());
       if(sessionMap==null||sessionMap.get("OrgId")==null)
       {
           return "ORG_unauthorized";
       }
       
       if(sessionMap.get("OrgId")!=null&&sessionMap.get("OrgName")!=null)
       {
           return ai.invoke();
       }
       
       return "ORG_unauthorized";
       
       
    }
    
}
