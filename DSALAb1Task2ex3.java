/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab1task2ex1;

/**
 *
 * @author NextGen Conputers
 */
public class DSALAb1Task2ex3 {
    
    //Insertion in final
    
    public static void main(String[] args){
        int[] middle=new int[6];
        middle[0]=5;
        middle[1]=1;
        middle[2]=2;
       middle[3]=3;
        middle[4]=4;
        middle[5]=5;
        for(int i=0; i<middle.length; i++){
            System.out.println("befor insertion");
            
        }
        int value=12;
        middle[middle.length-1]=value;
        System.out.println("after insertion in last");
        for(int i=0; i<middle.length; i++){
            System.out.println(middle[i]);
        }
    }
}
