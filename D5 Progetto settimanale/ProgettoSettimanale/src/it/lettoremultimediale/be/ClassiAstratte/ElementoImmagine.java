package it.lettoremultimediale.be.ClassiAstratte;

import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosita;

public abstract class ElementoImmagine extends ElementoMedia implements InterfacciaLuminosita {
    protected int luminosita;

    public ElementoImmagine(String titolo, int luminosita){
        super(titolo);
        if(luminosita > MAX_LUMINOSITA){
            System.out.println("Valore non valido, luminosità settata al massimo");
            this.luminosita = MAX_LUMINOSITA;
        } else {
            this.luminosita = luminosita;
        }
    }

//    public abstract void show();
}
