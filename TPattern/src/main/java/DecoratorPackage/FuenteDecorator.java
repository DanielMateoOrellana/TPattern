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
public class FuenteDecorator extends BaseDecorator {

    public FuenteDecorator(Personalizacion wrapper) {
        super(wrapper);
    }

    @Override
    public void personalizar(Reporte r) {

    }
}
