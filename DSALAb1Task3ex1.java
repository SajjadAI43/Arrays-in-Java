/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsalab1task3ex1;

/**
 *
 * @author NextGen Conputers
 */
public class DSALAb1Task3ex1 {
    
    //Deletion

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int deletion[]={12,23,45,67,78,89};
       
        System.out.println("Before the deletion");
        for(int i=0; i<deletion.length; i++){
            System.out.println(deletion[i]);
        }
        int deleteindex=3;
        for(int i=deleteindex; i<deletion.length-1; i++){
            deletion[i]=deletion[i+1];
            
        }
        deletion[deletion.length-1]=8;
        System.out.println("after deletion");
        for(int i=0; i<deletion.length; i++){
            System.out.println(deletion[i]);
        }*/
        
       int num[]={56,23,43,45,6,7,9,9,87,9,543,3};
     int delete=4;
     for(int i=delete; i<num.length-1; i++){
         num[i]=num[i+1];
     }
     num[num.length-1]=0;
        System.out.println("after deletion of certain element");
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
     
     
     
    }
    
}
