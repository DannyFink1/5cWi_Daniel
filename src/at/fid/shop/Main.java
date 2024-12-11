package at.fid.shop;

import at.fid.shop.products.Hat;
import at.fid.shop.products.Shoe;

public class Main {
    public static void main(String[] args) {

        Shoe shoe1 = new Shoe("DannySneaker", 10, 40);
        Shoe shoe2 = new Shoe("SteffiSneaker", 100, 4000);
        Shoe shoe3 = new Shoe("FloSneaker", 1000, 400);
        Hat hat1 = new Hat("DannyHat", 100, "Rund");
        Hat hat2 = new Hat("LetoHat", 1, "Dreieck");

        GUI gui = new GUI();

        gui.addProduct(shoe1);
        gui.addProduct(shoe2);
        gui.addProduct(shoe3);
        gui.addProduct(hat1);
        gui.addProduct(hat2);

        gui.run();
    }
}