/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaBodegueros5Factory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoHaciaBodegueros5Controller.getInstance();
    }
}
