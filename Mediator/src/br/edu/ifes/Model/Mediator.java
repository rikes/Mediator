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
public interface Mediator {
    public void enviar(List<Integer> sensores, Sensor sensor);
}
