/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Cliente;

import br.edu.ifes.Control.ControlaMedicao;
import br.edu.ifes.Model.TemperaturaExterna;
import br.edu.ifes.Model.TemperaturaSala;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henrique
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> s = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        ControlaMedicao control = new ControlaMedicao();
        
        TemperaturaExterna tempExterna = new TemperaturaExterna(control);
        TemperaturaSala tempSala = new TemperaturaSala(control);
        
        
        //Temperatura Sala de Aula
        s.add(33);
        s.add(22);
        s.add(19);
        //Temperatura Sala de Externa
        s2.add(30);
        s2.add(25);
        //int mediaSensor = 0;
        control.enviar(s2, tempSala);
        control.enviar(s, tempExterna);
        control.getMedia();
        
        
    }
    
}
