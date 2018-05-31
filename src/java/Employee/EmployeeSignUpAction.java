/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;


import com.opensymphony.xwork2.ActionSupport;
import controller.Login_Signup_ctrl;
/**
 *
 * @author Saurabh
 */
public class EmployeeSignUpAction extends ActionSupport {

    public Login_Signup_ctrl ctrl=new Login_Signup_ctrl();

    String mobNo;
    String cnfPassword;
    String empName;
    String empEmailId;
    String empGender;
    String empAddress;
    String empDeptName;
    String empJoiningDate;
    String empPassword;
    String empOrgCode;
    String empProjectId;

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getCnfPassword() {
        return cnfPassword;
    }

    public void setCnfPassword(String cnfPassword) {
        this.cnfPassword = cnfPassword;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmailId() {
        return empEmailId;
    }

    public void setEmpEmailId(String empEmailId) {
        this.empEmailId = empEmailId;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDeptName() {
        return empDeptName;
    }

    public void setEmpDeptName(String empDeptName) {
        this.empDeptName = empDeptName;
    }

    public String getEmpJoiningDate() {
        return empJoiningDate;
    }

    public void setEmpJoiningDate(String empJoiningDate) {
        this.empJoiningDate = empJoiningDate;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpOrgCode() {
        return empOrgCode;
    }

    public void setEmpOrgCode(String empOrgCode) {
        this.empOrgCode = empOrgCode;
    }

    public String getEmpProjectId() {
        return empProjectId;
    }

    public void setEmpProjectId(String empProjectId) {
        this.empProjectId = empProjectId;
    }


    

    

    @Override
    public void validate() {
//        if (employee.getEmpName().equals("")) {
//            addActionError("Name Cannot be Empty");
//        }
//        if (employee.getEmpGender().equals("")) {
//            addActionError("Select Gender");
//        }
//        if (getMobNo().equals("")) {
//            addActionError("Mob No cannot be empty");
//        } else if (getMobNo().length() != 10) {
//            addActionError("Invalid Mob No");
//        } else {
//            try {
//                employee.setEmpMobNo(Long.parseLong(getMobNo()));
//            } catch (NumberFormatException e) {
//                addActionError("Mob No Can Only be Numeric");
//            }
//        }
//        if (employee.getEmpPassword().equals("")) {
//            addActionError("Enter Password");
//        } else {
//            if (!employee.getEmpPassword().equals(getCnfPassword())) {
//                addActionError("Passwords Does not Match");
//            }
//        }
    }

    @Override
    public String execute() throws Exception {
//        if (EmployeeDAO.save(employee)) {
//            return SUCCESS;
//        }
        //    if(EmployeeDAO.save(new Employee(name, deptName, address, Long.parseLong(mobNo), new Date(), gender.charAt(0), emailId, password, emailId, Integer.parseInt(orgId)))) return SUCCESS;
        System.out.println("Execute Employee");
        if(ctrl.Insert_to_Employee(getEmpName(), getEmpAddress(), getMobNo(), getEmpJoiningDate(), getEmpGender(), getEmpEmailId(), getEmpPassword(),getEmpOrgCode())==true)
        {
            return SUCCESS;
        }
         addActionError("Error Saving");
        return INPUT;
    }
}
