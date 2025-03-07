/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

/**
 *
 * @author Codyg
 */
public class PrjClasses {

    public static void main(String[] args) {
        newClass nc = new newClass();
        
        nc.helloClass();// have to use variable name nc to communicate with the second class
        
        System.out.println(nc.strSecondClassVar);
    }
}
