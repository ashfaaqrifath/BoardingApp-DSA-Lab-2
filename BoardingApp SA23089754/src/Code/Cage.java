/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class Cage {
    private int cageNo;
    private String type;
    public boolean reserved;

    public Cage(int cageNo, String type) {
        this.cageNo = cageNo;
        this.type = type;
    }
    
    public int getCageNo(){
        return cageNo;
    }
    
    public String getType(){
        return type;
    }
    
    
}
