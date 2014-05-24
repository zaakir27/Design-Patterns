package com.zaakir.designPatterns.visitor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public interface NumberElement {
    public void accept(Numbervisitor visitor);
}
