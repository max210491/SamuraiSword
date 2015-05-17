/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CGCore.exceptions;

/**
 *
 * @author User
 */
public class TipoCartaAlredyExistException extends RuntimeException{
    
    public TipoCartaAlredyExistException(String message){
        super(message);
    }
}
