

import java.io.FileNotFoundException;
import java.io.IOException;

class Bases { 
    void dispaly() throws IOException, Exception {
        
        System.out.println(" Paerent saying hello");
        /* ((Deriveds)p).dispaly(); */
    }
    final void fun() { System.out.println("Derived fun() called"); } 
} 
   
class Deriveds extends Bases {
//     Deriveds(){
//       
//        
//    }
 void dispaly() throws Exception {
     
        System.out.println(" Child Saying helleeo");
        super.dispaly();
    }
} 
   
 public class AbstarctTest { 
    public static void main(String args[]) throws IOException {  
        Bases b = new Deriveds (); 
     
        b.dispaly();
       
       Deriveds d = new Deriveds ();
      d.dispaly();
       
       
    } 
}  