
package testing3;

public class Persona {
      public String nombre;
    public String apellido;
    public int edad;
    private String Id;
    
    public Persona(String nombre, String apellido,int edad){
        this.edad=edad;
        this.apellido=apellido;
        this.nombre=nombre;
        
    }
    public String getId(){
        return Id;
      
    }
    public void setId(String Id){
        this.Id=Id;
        
    }
      
    
    
            
}
