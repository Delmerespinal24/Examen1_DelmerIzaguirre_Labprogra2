/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exameni_delmerizaguirre_progra2;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class carpeta {
    
    private int numcarpeta;
    ArrayList<archivo> carpet = new ArrayList<archivo>();

    public carpeta(int numcarpeta) {
        this.numcarpeta = numcarpeta;
    }

    
    public Object[] carpeta() {
        ArrayList<String> carpeta = new ArrayList<>();
        int cont = 1;

        for (int i = 0; i < carpet.size(); i++) {
            carpeta.add("carpeta" + cont);
        }

        Object[] def = new Object[carpeta.size()];
        for (int i = 0; i < carpeta.size(); i++) {
            def[i] = carpeta.get(i);
        }

        return def;

    }

    @Override
    public String toString() {
        return "carpeta{" +numcarpeta+ '}';
    }
    
    

}
