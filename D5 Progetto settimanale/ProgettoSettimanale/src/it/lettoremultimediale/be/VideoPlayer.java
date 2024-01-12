package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoVideo;
import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosita;
import it.lettoremultimediale.be.Interfacce.InterfacciaPlay;
import it.lettoremultimediale.be.Interfacce.InterfacciaVolume;

public class VideoPlayer extends ElementoVideo implements InterfacciaPlay, InterfacciaVolume, InterfacciaLuminosita {

    public VideoPlayer(String titolo, int durata, int volume, int luminosita){
        super(titolo, durata, volume, luminosita);
    }
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println(" " + titolo);
        }
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
    public void abbassaVolume() {
        if(volume > MIN_VOLUME){
            volume--;
        }
    }

    @Override
    public void alzaVolume() {
        if(volume != MAX_VOLUME){
            volume++;
        }
    }

    @Override
    public void playMedia() {
        play();
    }

}
