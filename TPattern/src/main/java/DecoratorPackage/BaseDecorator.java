/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorPackage;

import BuilderPackage.Reporte;

/**
 *
 * @author CltControl
 */
public abstract class BaseDecorator extends Personalizacion{
    public Personalizacion wrapper;

    public BaseDecorator(Personalizacion wrapper) {
        this.wrapper = wrapper;
    }
    
    public void personalizar(Reporte r){
        
    }
}
