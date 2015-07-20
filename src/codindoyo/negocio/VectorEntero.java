/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codindoyo.negocio;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardo
 */
public class VectorEntero{
    private int n;
    private List<Entero> v;

    public VectorEntero() {
        this.n=0;
        this.v=new ArrayList<Entero>();
    }
    public void insert(Entero e){
        v.add(e);
    }
    public Entero read(int i){
        return v.get(i);
    }
    public void remove(int i){
        v.remove(i);
    }
    
}
