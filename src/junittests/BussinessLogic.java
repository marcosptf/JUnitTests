/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package junittests;

/**
 *
 * @author marcos
 */
public class BussinessLogic {
    
    public Boolean validate(final Integer primeNumber){
        for(int i=2;i<(primeNumber / 2);i++){
            if(primeNumber % i ==0){
                return false;
            }
        }
        return true;
    }
    
}
