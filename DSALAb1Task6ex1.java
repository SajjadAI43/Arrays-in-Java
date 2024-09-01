/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsalab1task6ex1;

/**
 *
 * @author NextGen Conputers
 */
public class DSALAb1Task6ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matrix = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                
                System.out.print(matrix[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }
        
        int newElment = 5;
        
        // insert at start
        for(int i=row-1; i>=0; i--){
            for(int j=col-1; j>0; j--){
            matrix[i][j]= matrix[i][j-1];
            }
            
            if(i>0){
            
            matrix[i][0] = matrix[i-1][col-1];
            }
        }
        
        matrix[0][0] = newElment;
        
        System.out.println("=================================================");
                
        
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }
         
        
        // Binary Search
        
        int target = 40;
        int start = 0;
        int end = matrix.length - 1;
        boolean bool = false;
        
        while(start<end){
        int mid = (start + end)/2;
        
        if(matrix[mid][0] > target){
            start = mid + 1;
        }
        
        else if(matrix[mid][0] < target){
        end = mid - 1;
        }  
        else{
            
            int newstart = 0;
            int newend = matrix[mid].length;
            
            while(newstart<newend){
            int newmid = newstart/newend;
            
            if(matrix[mid][newmid] > target){
            newstart = newmid + 1;
        }
        
        else if(matrix[mid][newmid] < target){
        newend = newmid - 1;
        } 
        else{
                System.out.println("Found");
                bool = true;
                break;
        }
            
            }
            
        if(bool = true){
        break;
        }
                    
                
        }
        
        }

        if(bool == false){
            
        System.out.println("Not Found");
        
        }
        
    }
    
}
