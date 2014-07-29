/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Control;

import br.edu.ifes.Model.Mediator;
import br.edu.ifes.Model.Sensor;
import br.edu.ifes.Model.TemperaturaExterna;
import br.edu.ifes.Model.TemperaturaSala;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henrique
 */
public class ControlaMedicao implements Mediator{
    protected ArrayList<Sensor> arraySensor;
    protected int media = 0;
    public ControlaMedicao(){
        arraySensor = new ArrayList<Sensor>();
    }
    
    @Override
    public void enviar(List<Integer> arraySensores, Sensor sensor) {
        this.media += sensor.recebeTemperatura(arraySensores);
//        for( Sensor sense : arraySensor){    
//            this.media += sense.recebeTemperatura(arraySensores);
//            sense.recebeTemperatura(arraySensores);
//        }
    }
    public void getMedia() {
        System.out.println("Media:"+this.media/2);
    }
    

}
