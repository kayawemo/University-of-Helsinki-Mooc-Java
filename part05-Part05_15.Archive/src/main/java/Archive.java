/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayod
 */
public class Archive {
    
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
        
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    //Check for equality.
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        
        if(!(obj instanceof Archive)){
            return false;
        }
        
        Archive comparedArchive = (Archive) obj;
        
        return this.identifier.equals(comparedArchive.identifier);
    }
    
    public String toString (){
        return this.identifier + ": " + this.name;
    }
}
