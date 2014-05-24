/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zaakir.designPatterns.mediator;


public class FrenchBuyer extends Buyer{
    public FrenchBuyer(Mediator mediator){
        super(mediator, "euro");
        this.mediator.registerFrenchBuyer(this);
    }
}
