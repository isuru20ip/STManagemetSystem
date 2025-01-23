package com.isuru20.GUI.panal;

/**
 *
 * @author ISURU
 */
public class Game {
    public static void main(String[] args) {
       Balla balla = Balla.getBalla(1);
       
    }
}

class Balla {

    private int natteDiga;

    private Balla(int natteDiga) {
        this.natteDiga = natteDiga;
    }

    public static Balla getBalla(int natteDiga) {
        if (natteDiga >= 1) {
            return new Balla(natteDiga);
        }
        return null;
    }
}
