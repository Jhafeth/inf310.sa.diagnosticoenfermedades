/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inf310.sa.diagnosticoenfermedades;

import java.util.LinkedList;

/**
 *
 * @author Jhafeth
 */
public class Enfermedad {

    LinkedList<Sintoma> sintomas;

    public Enfermedad() {
        sintomas = new LinkedList<>();
    }

    public LinkedList<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(LinkedList<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }

    public void addSintoma(String nombre, int valor) {
        Sintoma s = new Sintoma(nombre, valor);
        this.sintomas.add(s);
    }

    public int valueOf(String nombre) {
        for (int i = 0; i < sintomas.size(); i++) {
            if (sintomas.get(i).getNombre().equals(nombre)) {
                return sintomas.get(i).getValor();
            }
        }
        return 0;
    }

}
