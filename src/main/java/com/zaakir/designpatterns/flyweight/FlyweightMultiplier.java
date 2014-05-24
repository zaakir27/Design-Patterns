/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zaakir.designPatterns.flyweight;


public class FlyweightMultiplier implements Flyweight{

    String operation;
    public FlyweightMultiplier(){
        operation = "adding";
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public int doMath(int a, int b) {
       return a*b;
    }
    
    
}
