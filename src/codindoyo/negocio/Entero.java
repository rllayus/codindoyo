/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codindoyo.negocio;

/**
 *
 * @author ricardo
 */
public class Entero {
    private int n;

    public Entero() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public boolean isPair(){
        return n%2==0;
    }
}
