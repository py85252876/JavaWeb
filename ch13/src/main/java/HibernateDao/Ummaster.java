package HibernateDao;

import java.util.HashSet;
import java.util.Set;

/**
 * Ummaster generated by MyEclipse Persistence Tools
 */

public class Ummaster implements java.io.Serializable {

    // Fields

    private String umId;

    private String umDesc;

    private Set itemgenerals = new HashSet(0);

    // Constructors

    /**
     * default constructor
     */
    public Ummaster() {
    }

    /**
     * minimal constructor
     */
    public Ummaster(String umId) {
        this.umId = umId;
    }

    /**
     * full constructor
     */
    public Ummaster(String umId, String umDesc, Set itemgenerals) {
        this.umId = umId;
        this.umDesc = umDesc;
        this.itemgenerals = itemgenerals;
    }

    // Property accessors

    public String getUmId() {
        return this.umId;
    }

    public void setUmId(String umId) {
        this.umId = umId;
    }

    public String getUmDesc() {
        return this.umDesc;
    }

    public void setUmDesc(String umDesc) {
        this.umDesc = umDesc;
    }

    public Set getItemgenerals() {
        return this.itemgenerals;
    }

    public void setItemgenerals(Set itemgenerals) {
        this.itemgenerals = itemgenerals;
    }

}