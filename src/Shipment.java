public class Shipment {
    private int id;
    private String forwarder;
    private String incoterms;

    Shipment() {
        this.id = generateID();
        this.forwarder = "unknown";
        this.incoterms = "unassigned";
    }

    Shipment (int id, String forwarder, String incoterms) {
        this.id = generateID();
        this.forwarder = forwarder;
        this.incoterms = incoterms;
    }

    public int getId() {
        return id;
    }

    public String getForwarder() {
        return forwarder;
    }

    public String getIncoterms() {
        return incoterms;
    }

    public void setForwarder(String forwarder) {
        this.forwarder = forwarder;
    }

    public void setIncoterms(String incoterms) {
        this.incoterms = incoterms;
    }

    private int generateID() {
        return 5;
    }
}
