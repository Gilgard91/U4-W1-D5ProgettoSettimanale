package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoImmagine;
import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosita;

public class ImagePlayer extends ElementoImmagine implements InterfacciaLuminosita {

    public ImagePlayer(String titolo, int luminosita){
        super(titolo, luminosita);
    }


    public void show() {
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println(" " + titolo);
    }

    @Override
    public void diminuisciLuminosita() {
        if(luminosita > MIN_LUMINOSITA){
            luminosita--;
        }
    }
    @Override
    public void aumentaLuminosita() {
        if(luminosita != MAX_LUMINOSITA){
            luminosita++;
        }
    }

    @Override
    public void playMedia() {
        show();
    }
}
