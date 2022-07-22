/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegracionJenkins;


public class Main {
    
    public static void main(String[] args){
        RelationalOperator relOp=new RelationalOperator();
        final int max_height = 15;
        final int max_width = 10;
        final int min_height = 5;
        final int min_width = 2;
        
        //Dimension of the object
        final int object_height=12;
        final int object_width=10;
        
        relOp.goodHeight(object_height, min_height, max_height);
        
        relOp.goodWidth(object_width, min_width, max_width);
    }
}
