public class Shipment {
    public int id;
    public String forwarder;
    public String incoterms;

    Shipment() {
        this.id = 1;
        this.forwarder = "unknown";
        this.incoterms = "unassigned";
    }

    Shipment (int id, String forwarder, String incoterms) {
        this.id = id;
        this.forwarder = forwarder;
        this.incoterms = incoterms;
    }
}
