/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zaakir.designPatterns.singleton;


public class Singleton {
    
    private static Singleton singleton = null;
    
    public static Singleton getInstance(){
        
        if(singleton == null){
            singleton = new Singleton();
        }
        
        return singleton;
    }
    
    public int getID(){
        return 1001;
    }
}
