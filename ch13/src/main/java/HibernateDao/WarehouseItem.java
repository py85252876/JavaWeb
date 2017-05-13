package HibernateDao;

/**
 * WarehouseItem generated by MyEclipse Persistence Tools
 */

public class WarehouseItem implements java.io.Serializable {

    // Fields

    private WarehouseItemId id;

    private Itemgeneral itemgeneral;

    private Warehouse warehouse;

    // Constructors

    /**
     * default constructor
     */
    public WarehouseItem() {
    }

    /**
     * full constructor
     */
    public WarehouseItem(WarehouseItemId id, Itemgeneral itemgeneral,
                         Warehouse warehouse) {
        this.id = id;
        this.itemgeneral = itemgeneral;
        this.warehouse = warehouse;
    }

    // Property accessors

    public WarehouseItemId getId() {
        return this.id;
    }

    public void setId(WarehouseItemId id) {
        this.id = id;
    }

    public Itemgeneral getItemgeneral() {
        return this.itemgeneral;
    }

    public void setItemgeneral(Itemgeneral itemgeneral) {
        this.itemgeneral = itemgeneral;
    }

    public Warehouse getWarehouse() {
        return this.warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

}