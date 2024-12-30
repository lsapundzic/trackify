public class Shipment {
    private int id;
    private String forwarder;
    private String incoterms;

    Shipment (String forwarder, String incoterms) {
        this.id = generateID();
        setForwarder(forwarder);
        setIncoterms(incoterms);
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
      final int placeholder = 5;

        System.out.println("Generated ID is " + placeholder);

        return placeholder;
    };
}
