
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayod
 */
public class Stack {
    
    ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        
        ArrayList<String> list = new ArrayList<>();
        
        
        
    }
}
