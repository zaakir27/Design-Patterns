/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zaakir.designPatterns.mediator;


public class AmericanSeller {
    Mediator mediator;
    float priceInDollars;
    
    public AmericanSeller(Mediator mediator, float priceInDollars){
        this.mediator = mediator;
        this.priceInDollars= priceInDollars;
        this.mediator.registerAmericanSeller(this);
    }
    public boolean isBidAccepted(float bidInDollars){
        if(bidInDollars>= priceInDollars){
            return true;
        }
        else
            return false;
    }
}
