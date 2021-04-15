
package templatemethod;

public class TemplateMethod {

    public static void main(String[] args) {
        
        Receitas bolo = new BoloBanana();
        Receitas bolo2 = new BoloCastanha();
        
        bolo.modoPreparo();
        bolo2.modoPreparo();
    }
    
}
