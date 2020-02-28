package com.demo;

import java.util.HashMap;
import java.util.Map;

class KeylessEntry {
    
    static class Key {
       Integer id;
  
       Key(Integer id) {
          this.id = id;
       }
  
       @Override
       public int hashCode() {
          return id.hashCode();
       }
    }
  
    public static void main(String[] args) {
       Map m = new HashMap();
       while (true)
          for (int i = 0; i < 10; i++) {
           
                m.put(new Key(i), "Number:" + i);
             System.out.println(i);
          }
      
    }
 }