package com.cifpcarballeira.Kata.FizzBuzz.Tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cifpcarballeira.katas.FizzBuzz.FizzBUzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam216
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }

     @Test
     public void test1devuelve1() {
         FizzBUzz fb = new FizzBUzz();
         String resultado = fb.getFizzBuzz(1);
         assertEquals("1",resultado);
     }
     @Test
     public void test2devuelve2() {
         FizzBUzz fb = new FizzBUzz();
         String resultado = fb.getFizzBuzz(2);
         assertEquals("2",resultado);
     }
     
     @Test
     public void test3devuelveFizz() {
         FizzBUzz fb = new FizzBUzz();
         String resultado = fb.getFizzBuzz(3);
         assertEquals("Fizz",resultado);
     }
     
     @Test
     public void test5devuelveBuzz() {
         FizzBUzz fb = new FizzBUzz();
         String resultado = fb.getFizzBuzz(5);
         assertEquals("Buzz",resultado);
     }
     @Test
     public void testdevuelveFizzBuzz() {
         FizzBUzz fb = new FizzBUzz();
         String resultado = fb.getFizzBuzz(15);
         assertEquals("FizzBuzz",resultado);
     }
      @Test
     public void testcontiene3() {
         FizzBUzz fb = new FizzBUzz();
         String resultado = fb.getFizzBuzz(13);
         assertEquals("Fizz",resultado);
     }
     @Test
     public void testcontiene5() {
         FizzBUzz fb = new FizzBUzz();
         String resultado = fb.getFizzBuzz(25);
         assertEquals("Buzz",resultado);
     }
     
    
     }
     
