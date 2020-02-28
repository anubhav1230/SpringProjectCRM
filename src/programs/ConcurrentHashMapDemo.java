package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.*; 
 public class ConcurrentHashMapDemo 
{ 
    public static void main(String[] args) 
    { 
        Map<Integer, String> m=new HashMap(); 
        m.put(100,"Hello"); 
        m.put(101,"Geeks"); 
        m.put(102,"Geeks"); 
        m.put(103,"Hello"); 
//       for (Map.Entry<Integer, String> theEntry: m.entrySet()) {
//           m.remove(101);
//           System.out.println(theEntry.getValue());
//        
//           
//       }
        
       Iterator<Integer> theIterator = m.keySet().iterator();
       
       
       while(theIterator.hasNext()){
       
     System.out.println(theIterator.next());
           
         theIterator.remove();
       
        
       }
        
      System.out.println(m.isEmpty());
    } 
}  