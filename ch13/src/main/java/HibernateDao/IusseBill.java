package HibernateDao;

import java.util.Date;

/**
 * IusseBill generated by MyEclipse Persistence Tools
 */

public class IusseBill implements java.io.Serializable {

    // Fields

    private String billNo;

    private Employee employeeByCreateEmp;

    private Employee employeeByHandleEmp;

    private String billDesc;

    private Date createDate;

    private Date lastHandleDate;

    private String destCompany;

    private String certNo;

    private String status;

    // Constructors

    /**
     * default constructor
     */
    public IusseBill() {
    }

    /**
     * minimal constructor
     */
    public IusseBill(String billNo, Employee employeeByCreateEmp,
                     Date createDate, String destCompany, String certNo, String status) {
        this.billNo = billNo;
        this.employeeByCreateEmp = employeeByCreateEmp;
        this.createDate = createDate;
        this.destCompany = destCompany;
        this.certNo = certNo;
        this.status = status;
    }

    /**
     * full constructor
     */
    public IusseBill(String billNo, Employee employeeByCreateEmp,
                     Employee employeeByHandleEmp, String billDesc, Date createDate,
                     Date lastHandleDate, String destCompany, String certNo,
                     String status) {
        this.billNo = billNo;
        this.employeeByCreateEmp = employeeByCreateEmp;
        this.employeeByHandleEmp = employeeByHandleEmp;
        this.billDesc = billDesc;
        this.createDate = createDate;
        this.lastHandleDate = lastHandleDate;
        this.destCompany = destCompany;
        this.certNo = certNo;
        this.status = status;
    }

    // Property accessors

    public String getBillNo() {
        return this.billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Employee getEmployeeByCreateEmp() {
        return this.employeeByCreateEmp;
    }

    public void setEmployeeByCreateEmp(Employee employeeByCreateEmp) {
        this.employeeByCreateEmp = employeeByCreateEmp;
    }

    public Employee getEmployeeByHandleEmp() {
        return this.employeeByHandleEmp;
    }

    public void setEmployeeByHandleEmp(Employee employeeByHandleEmp) {
        this.employeeByHandleEmp = employeeByHandleEmp;
    }

    public String getBillDesc() {
        return this.billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastHandleDate() {
        return this.lastHandleDate;
    }

    public void setLastHandleDate(Date lastHandleDate) {
        this.lastHandleDate = lastHandleDate;
    }

    public String getDestCompany() {
        return this.destCompany;
    }

    public void setDestCompany(String destCompany) {
        this.destCompany = destCompany;
    }

    public String getCertNo() {
        return this.certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}