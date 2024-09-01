/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsalab1task2ex1;


public class DSALAb1Task2ex1 {
//insertion in first
    
    public static void main(String[] args) {
        
  int[] array=new int[9];
  array[0]=0;
  array[1]=1;
  array[2]=2;
  array[3]=3;
  array[4]=4;
  array[5]=5;
  array[6]=0;
  for(int i=0; i<array.length; i++){
      System.out.println("before inseration "+ array[i]);
  }
  int newe=6;
  for(int i=array.length-1;i>0;i--){
      array[i]=array[i-1];
  }
  array[0]=newe;
  for(int i=0;i<array.length; i++){
      System.out.println("after inseration from start"+ array[i]);
  }

  
  
    }
    
}
