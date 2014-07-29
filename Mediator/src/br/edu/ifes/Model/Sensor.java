/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henrique
 */
public abstract class Sensor{
    protected Mediator mediator;
    
    public Sensor (Mediator m){
        this.mediator = m;
    }
    
    public void enviaTemperatura(List<Integer> sensores){
        mediator.enviar(sensores, this);
    }
    
    public abstract int recebeTemperatura(List<Integer> sensores);
}
