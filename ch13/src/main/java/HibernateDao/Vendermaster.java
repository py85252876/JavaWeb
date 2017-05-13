package HibernateDao;

/**
 * Vendermaster generated by MyEclipse Persistence Tools
 */

public class Vendermaster implements java.io.Serializable {

    // Fields

    private String vendId;

    private Vendtype vendtype;

    private Shipvin shipvin;

    private String vendDesc;

    private String vendAddr;

    private String vendCity;

    private String vendNati;

    private String vendPhone;

    private String vendPost;

    private String vendEmail;

    private Long tradeAmount;

    private String contMan;

    // Constructors

    /**
     * default constructor
     */
    public Vendermaster() {
    }

    /**
     * minimal constructor
     */
    public Vendermaster(String vendId) {
        this.vendId = vendId;
    }

    /**
     * full constructor
     */
    public Vendermaster(String vendId, Vendtype vendtype, Shipvin shipvin,
                        String vendDesc, String vendAddr, String vendCity, String vendNati,
                        String vendPhone, String vendPost, String vendEmail,
                        Long tradeAmount, String contMan) {
        this.vendId = vendId;
        this.vendtype = vendtype;
        this.shipvin = shipvin;
        this.vendDesc = vendDesc;
        this.vendAddr = vendAddr;
        this.vendCity = vendCity;
        this.vendNati = vendNati;
        this.vendPhone = vendPhone;
        this.vendPost = vendPost;
        this.vendEmail = vendEmail;
        this.tradeAmount = tradeAmount;
        this.contMan = contMan;
    }

    // Property accessors

    public String getVendId() {
        return this.vendId;
    }

    public void setVendId(String vendId) {
        this.vendId = vendId;
    }

    public Vendtype getVendtype() {
        return this.vendtype;
    }

    public void setVendtype(Vendtype vendtype) {
        this.vendtype = vendtype;
    }

    public Shipvin getShipvin() {
        return this.shipvin;
    }

    public void setShipvin(Shipvin shipvin) {
        this.shipvin = shipvin;
    }

    public String getVendDesc() {
        return this.vendDesc;
    }

    public void setVendDesc(String vendDesc) {
        this.vendDesc = vendDesc;
    }

    public String getVendAddr() {
        return this.vendAddr;
    }

    public void setVendAddr(String vendAddr) {
        this.vendAddr = vendAddr;
    }

    public String getVendCity() {
        return this.vendCity;
    }

    public void setVendCity(String vendCity) {
        this.vendCity = vendCity;
    }

    public String getVendNati() {
        return this.vendNati;
    }

    public void setVendNati(String vendNati) {
        this.vendNati = vendNati;
    }

    public String getVendPhone() {
        return this.vendPhone;
    }

    public void setVendPhone(String vendPhone) {
        this.vendPhone = vendPhone;
    }

    public String getVendPost() {
        return this.vendPost;
    }

    public void setVendPost(String vendPost) {
        this.vendPost = vendPost;
    }

    public String getVendEmail() {
        return this.vendEmail;
    }

    public void setVendEmail(String vendEmail) {
        this.vendEmail = vendEmail;
    }

    public Long getTradeAmount() {
        return this.tradeAmount;
    }

    public void setTradeAmount(Long tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getContMan() {
        return this.contMan;
    }

    public void setContMan(String contMan) {
        this.contMan = contMan;
    }

}