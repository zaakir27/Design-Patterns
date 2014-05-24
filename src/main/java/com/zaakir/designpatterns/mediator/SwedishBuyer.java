/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zaakir.designPatterns.mediator;


public class SwedishBuyer extends Buyer{
    public SwedishBuyer(Mediator mediator){
        super(mediator, "krona");
        this.mediator.registerSwedishBuyer(this);
    }
}
