/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zaakir.designPatterns.bridge;


public class BigEngine implements Engine{
    int horsepower; 

    public BigEngine(){
        horsepower = 350;
    }
    @Override
    public int go() {
       return horsepower; 
    }
}
