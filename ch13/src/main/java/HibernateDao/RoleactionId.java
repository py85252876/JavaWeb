package HibernateDao;

/**
 * RoleactionId generated by MyEclipse Persistence Tools
 */

public class RoleactionId implements java.io.Serializable {

    // Fields

    private Rolemaster rolemaster;

    private Actionmaster actionmaster;

    // Constructors

    /**
     * default constructor
     */
    public RoleactionId() {
    }

    /**
     * full constructor
     */
    public RoleactionId(Rolemaster rolemaster, Actionmaster actionmaster) {
        this.rolemaster = rolemaster;
        this.actionmaster = actionmaster;
    }

    // Property accessors

    public Rolemaster getRolemaster() {
        return this.rolemaster;
    }

    public void setRolemaster(Rolemaster rolemaster) {
        this.rolemaster = rolemaster;
    }

    public Actionmaster getActionmaster() {
        return this.actionmaster;
    }

    public void setActionmaster(Actionmaster actionmaster) {
        this.actionmaster = actionmaster;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof RoleactionId))
            return false;
        RoleactionId castOther = (RoleactionId) other;

        return ((this.getRolemaster() == castOther.getRolemaster()) || (this
                .getRolemaster() != null
                && castOther.getRolemaster() != null && this.getRolemaster()
                .equals(castOther.getRolemaster())))
                && ((this.getActionmaster() == castOther.getActionmaster()) || (this
                .getActionmaster() != null
                && castOther.getActionmaster() != null && this
                .getActionmaster().equals(castOther.getActionmaster())));
    }

    public int hashCode() {
        int result = 17;

        result = 37
                * result
                + (getRolemaster() == null ? 0 : this.getRolemaster()
                .hashCode());
        result = 37
                * result
                + (getActionmaster() == null ? 0 : this.getActionmaster()
                .hashCode());
        return result;
    }

}