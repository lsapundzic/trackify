public class Main {
    public static void main(String[] args) {

        System.out.println("\t- - - PROGRAM STARTED - - -");

        Shipment container = new Shipment("K+N", "FOB");

        System.out.println(container.getIncoterms() + " " + container.getForwarder());
    }

}
