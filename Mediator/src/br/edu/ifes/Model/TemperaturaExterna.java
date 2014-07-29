/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Henrique
 */
public class TemperaturaExterna extends Sensor{

    public TemperaturaExterna(Mediator m) {
        super(m);
    }
    @Override
    public int recebeTemperatura(List<Integer> sensores) {
        int media = 0;
        int i;
        for (i=0; i < sensores.size(); i++){
            media += sensores.get(i);
        }
        System.out.println("Sensor externo:"+(media/i));
        return media/i;
    }

    
}
