package HibernateDao;

import java.util.HashSet;
import java.util.Set;

/**
 * Warehouse generated by MyEclipse Persistence Tools
 */

public class Warehouse implements java.io.Serializable {

    // Fields

    private String wareId;

    private String wareDesc;

    private String wareAdrr;

    private String valEmp;

    private String fax;

    private String phone;

    private Set inventorytags = new HashSet(0);

    private Set eceipts = new HashSet(0);

    private Set warehouseItems = new HashSet(0);

    private Set iusses = new HashSet(0);

    private Set itemlocations = new HashSet(0);

    private Set physicsdatas = new HashSet(0);

    private Set itemlocations_1 = new HashSet(0);

    // Constructors

    /**
     * default constructor
     */
    public Warehouse() {
    }

    /**
     * minimal constructor
     */
    public Warehouse(String wareId) {
        this.wareId = wareId;
    }

    /**
     * full constructor
     */
    public Warehouse(String wareId, String wareDesc, String wareAdrr,
                     String valEmp, String fax, String phone, Set inventorytags,
                     Set eceipts, Set warehouseItems, Set iusses, Set itemlocations,
                     Set physicsdatas, Set itemlocations_1) {
        this.wareId = wareId;
        this.wareDesc = wareDesc;
        this.wareAdrr = wareAdrr;
        this.valEmp = valEmp;
        this.fax = fax;
        this.phone = phone;
        this.inventorytags = inventorytags;
        this.eceipts = eceipts;
        this.warehouseItems = warehouseItems;
        this.iusses = iusses;
        this.itemlocations = itemlocations;
        this.physicsdatas = physicsdatas;
        this.itemlocations_1 = itemlocations_1;
    }

    // Property accessors

    public String getWareId() {
        return this.wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getWareDesc() {
        return this.wareDesc;
    }

    public void setWareDesc(String wareDesc) {
        this.wareDesc = wareDesc;
    }

    public String getWareAdrr() {
        return this.wareAdrr;
    }

    public void setWareAdrr(String wareAdrr) {
        this.wareAdrr = wareAdrr;
    }

    public String getValEmp() {
        return this.valEmp;
    }

    public void setValEmp(String valEmp) {
        this.valEmp = valEmp;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set getInventorytags() {
        return this.inventorytags;
    }

    public void setInventorytags(Set inventorytags) {
        this.inventorytags = inventorytags;
    }

    public Set getEceipts() {
        return this.eceipts;
    }

    public void setEceipts(Set eceipts) {
        this.eceipts = eceipts;
    }

    public Set getWarehouseItems() {
        return this.warehouseItems;
    }

    public void setWarehouseItems(Set warehouseItems) {
        this.warehouseItems = warehouseItems;
    }

    public Set getIusses() {
        return this.iusses;
    }

    public void setIusses(Set iusses) {
        this.iusses = iusses;
    }

    public Set getItemlocations() {
        return this.itemlocations;
    }

    public void setItemlocations(Set itemlocations) {
        this.itemlocations = itemlocations;
    }

    public Set getPhysicsdatas() {
        return this.physicsdatas;
    }

    public void setPhysicsdatas(Set physicsdatas) {
        this.physicsdatas = physicsdatas;
    }

    public Set getItemlocations_1() {
        return this.itemlocations_1;
    }

    public void setItemlocations_1(Set itemlocations_1) {
        this.itemlocations_1 = itemlocations_1;
    }

}