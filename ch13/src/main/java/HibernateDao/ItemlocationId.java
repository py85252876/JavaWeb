package HibernateDao;

/**
 * ItemlocationId generated by MyEclipse Persistence Tools
 */

public class ItemlocationId implements java.io.Serializable {

    // Fields

    private Warehouse warehouse;

    private String itemId;

    private Location location;

    private Integer rank;

    private Double locaQty;

    // Constructors

    /**
     * default constructor
     */
    public ItemlocationId() {
    }

    /**
     * full constructor
     */
    public ItemlocationId(Warehouse warehouse, String itemId,
                          Location location, Integer rank, Double locaQty) {
        this.warehouse = warehouse;
        this.itemId = itemId;
        this.location = location;
        this.rank = rank;
        this.locaQty = locaQty;
    }

    // Property accessors

    public Warehouse getWarehouse() {
        return this.warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getRank() {
        return this.rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getLocaQty() {
        return this.locaQty;
    }

    public void setLocaQty(Double locaQty) {
        this.locaQty = locaQty;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof ItemlocationId))
            return false;
        ItemlocationId castOther = (ItemlocationId) other;

        return ((this.getWarehouse() == castOther.getWarehouse()) || (this
                .getWarehouse() != null
                && castOther.getWarehouse() != null && this.getWarehouse()
                .equals(castOther.getWarehouse())))
                && ((this.getItemId() == castOther.getItemId()) || (this
                .getItemId() != null
                && castOther.getItemId() != null && this.getItemId()
                .equals(castOther.getItemId())))
                && ((this.getLocation() == castOther.getLocation()) || (this
                .getLocation() != null
                && castOther.getLocation() != null && this
                .getLocation().equals(castOther.getLocation())))
                && ((this.getRank() == castOther.getRank()) || (this.getRank() != null
                && castOther.getRank() != null && this.getRank()
                .equals(castOther.getRank())))
                && ((this.getLocaQty() == castOther.getLocaQty()) || (this
                .getLocaQty() != null
                && castOther.getLocaQty() != null && this.getLocaQty()
                .equals(castOther.getLocaQty())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result
                + (getWarehouse() == null ? 0 : this.getWarehouse().hashCode());
        result = 37 * result
                + (getItemId() == null ? 0 : this.getItemId().hashCode());
        result = 37 * result
                + (getLocation() == null ? 0 : this.getLocation().hashCode());
        result = 37 * result
                + (getRank() == null ? 0 : this.getRank().hashCode());
        result = 37 * result
                + (getLocaQty() == null ? 0 : this.getLocaQty().hashCode());
        return result;
    }

}