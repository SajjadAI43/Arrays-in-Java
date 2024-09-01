/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsalab1task5ex1;

/**
 *
 * Linear No need of Sort Search
 */
public class DSALAb1Task5ex1 {

   
    public static void main(String[] args) {
       /* int ali[]={34,45,3,2,1,5};
        int target=5;
        boolean found=false;
        for(int i=0; i<ali.length; i++){
            if(ali[i]==target){
                System.out.println("Element "+ target+"  is found at index  "+ i);
                        found=true;
                        break;
                        
            }
            
        }
        if(found==false){
            System.out.println("Element "+ target+"  not found at index  ");
        }
        
*/
   int array[]={12,23,45,67,89,90};
   int point=12;
  boolean find =false;
   for(int i=0; i<array.length; i++){
       if(array[i]==point){
           System.out.println("the Element "+point+" is found at the index "+i);
           find =true;
           break;
       }
   }
       
       
       if(find==false){
           System.out.println( "the Element "+point+" does not found" );
       }
       
       
        
    }
    
}
