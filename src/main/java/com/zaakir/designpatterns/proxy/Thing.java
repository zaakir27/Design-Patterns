/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zaakir.designPatterns.proxy;

import java.util.Date;


public abstract class Thing {
    
    public String sayHello(){
        return this.getClass().getSimpleName() +" Hello ";
    }
}
