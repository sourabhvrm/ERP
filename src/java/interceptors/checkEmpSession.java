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
public class checkEmpSession implements Interceptor{

    @Override
    public void destroy() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        SessionMap<String,Object> sessionMap=(SessionMap)(ai.getInvocationContext().getSession());
       if(sessionMap==null||sessionMap.get("empEmailId")==null)
       {
           return "EMP_unauthorized";
       }
       
       if(sessionMap.get("empEmailId")!=null&&sessionMap.get("empName")!=null)
       {
           return ai.invoke();
       }
       
       return "EMP_unauthorized";
    }
    
}
