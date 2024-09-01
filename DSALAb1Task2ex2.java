/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab1task2ex1;


public class DSALAb1Task2ex2 {
    public static void main(String[]args ){
      //insertion in midddle  
    
   int[] last=new int[6];
   last[0]=0;
   last[1]=2;
   last[2]=1;
   last[3]=4;
   last[4]=3;
   last[5]=6;
   for(int i=0;i<last.length; i++){
       System.out.println("Before inseration "+ last[i]);
   }
   int newelement=10;
   int position=3;
   for(int i=last.length-1; i>position; i--){
       last[i]=last[i-1];
       
   }
       last[position]=newelement;
        System.out.println("after insertion");
        for(int i=0; i<last.length; i++){
            System.out.println(last[i]);
        }

    }
}