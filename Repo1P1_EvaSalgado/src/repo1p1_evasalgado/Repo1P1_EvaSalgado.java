
package repo1p1_evasalgado;
import java.util.Scanner; 
/**
 *
 * @author Eva Salgado
 */
public class Repo1P1_EvaSalgado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion ; 
        char resp = 's'; 
        
        while (resp!=4&&resp=='s'||resp=='S'){
        System.out.println("\n1.Ola de Palabra\n2.Mini codificador\n3. sqrt");
        
        System.out.println("Ingrese una opción: ");
        opcion = leer.nextInt();
        
        switch (opcion){
            
            case 1: 
                System.out.println("Ingrese la cadena");
                String cadena = leer.next().toLowerCase(); 
                int numletra = 0; 
                String acum =" ";
                String acum2 = " ";
                for(int i=0;i<cadena.length();i++){
                  
                   char letra = cadena.charAt(i); 
                   numletra = letra; 
                
                      if (numletra<123&&numletra>96){ 
                       acum = acum.toUpperCase() + letra; 
                }  
                   
                   
                   
                  System.out.println(acum);    
                } 
              break; 
              
            case 2: 
                System.out.println("Ingrese un numero para el defase: ");
                int n = leer.nextInt(); 
                System.out.println("Ingrese la cadena que desea codificar: ");
                String word = leer.next().toLowerCase(); 
               
                String acumu = " ";
                int numletter = 0; 
                for (int i =0;i<word.length();i++){
                    char letra = word.charAt(i); 
                    
                    numletter = letra; 
                    if(numletter<123&&numletter>96){
                       if(numletter%2==0){
                           acumu = acumu + letra + (char)n;  
                       } 
                       }
                    } System.out.println(acumu);
             break; 
            case 3: 
                double Acum = 0;
               
                System.out.println("Ingrese N: ");
                double N = leer.nextInt(); 
                for (int i=0;i<=N;i++){
                    Acum *=i;
                } System.out.println(Acum);
                break; 
        } 
        System.out.println("Desea ingresar otra opcion?: ");
        resp = leer.next().charAt(0);
        }
    }
    
}
