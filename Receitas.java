
package templatemethod;

public abstract class Receitas{
   
    
    public Receitas(){
        
    };
    void modoPreparo(){
        System.out.println("Preparando bolo: ");
        misturaIng();
        colocar_Forma();
        adicionarEssencia();
        assar();
    }
    
    void misturaIng(){
        System.out.println("Ingredientes misturados...");
    }
    
    void colocar_Forma(){
        System.out.println("Ingredientes adicionados a forma...");
    }
    
    void assar(){
         System.out.println("Bolo colocado para assar!\n");
    }
    
     abstract void adicionarEssencia();
    
}

