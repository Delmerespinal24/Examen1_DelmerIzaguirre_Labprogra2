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
public class Proyecto {
    private String nombre;
    int commits;
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    private ArrayList<archivo> carpetas = new ArrayList<archivo>();

    public Proyecto(String nombre) {
        this.nombre = nombre;
        commits = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCommits() {
        return commits;
    }
    
    public String getColaboladores(){
        String colaboradores = "";
        for (int i = 0; i < personas.size(); i++) {
            colaboradores+= personas.get(i).getNick() + ", ";
            
        }
        return colaboradores;
        
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<archivo> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<archivo> carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", commits=" + commits + ", personas=" + personas + ", carpetas=" + carpetas + '}';
    }
    
    
}
