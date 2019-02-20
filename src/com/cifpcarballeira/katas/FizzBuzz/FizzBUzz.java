/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author dam216
 */
public class FizzBUzz {
  public String  getFizzBuzz(int i){
      
      String s=i+"";
      
      if (i%3==0) {
          if (i%5==0) {
         return "FizzBuzz"; 
      }
              else{
         return "Fizz"; }
          
      }
      else  if (i%5==0) {
         return "Buzz"; 
      }
      else if(s.contains("3")){return "Fizz";}
      else if(s.contains("5")){return "Buzz";}
      else{
         return i+"";
      }
  }
    
}
