/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zaakir.designPatterns.abstractfactory;

import com.zaakir.designPatterns.factorymethod.Animal;


public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);
}
