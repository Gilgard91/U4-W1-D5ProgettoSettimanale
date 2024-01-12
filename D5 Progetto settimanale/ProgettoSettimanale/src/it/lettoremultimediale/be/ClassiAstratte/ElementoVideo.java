package it.lettoremultimediale.be.ClassiAstratte;

import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosita;
import it.lettoremultimediale.be.Interfacce.InterfacciaVolume;

public abstract class ElementoVideo extends ElementoMedia implements InterfacciaLuminosita, InterfacciaVolume {
    protected int volume;
    protected int luminosita;

    protected int durata;

    public ElementoVideo(String titolo, int durata, int volume, int luminosita){
        super(titolo);
        if(volume > MAX_VOLUME){
            System.out.println("Valore non valido, volume settato al massimo");
            this.volume = MAX_VOLUME;
        } else {
            this.volume = volume;
        };
        if(luminosita > MAX_LUMINOSITA){
            System.out.println("Valore non valido, luminosità settata al massimo ");
            this.luminosita = MAX_LUMINOSITA;
        } else {
            this.luminosita = luminosita;
        };
        this.durata = durata;

    }


}
