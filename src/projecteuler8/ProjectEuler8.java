
package projecteuler8;
import java.util.*;
/**
 *
 * @author github.com/zahidari
 */
public class ProjectEuler8 {

    static int func2(int ADJACENT ,String str){
        
        //initialize the size of the vecot with ADJACENT length
        Vector<Integer> vec = new Vector<Integer>(ADJACENT);
        
        int strIta = 0;
        
        
        while(strIta < str.length()){
            int temp = Character.getNumericValue(str.charAt(strIta));
            
            if(vec.size() == 13){
                
            }
            vec.add(temp);
            
            
            
            
            
            
            
            strIta++;
        }
        
        
        
        
        
        
        
        
        
        return 1;
    }
    
   static  void  func(int ADJACENT ,char ch[]){
       
       
       int index = 0; // to iterate
       int temp1 = 1; // multiplySum every time the set
       int searchedIndex = 0; // index of the result beginning index
       
       
       //compare and find the highest
       long tempProduct = 1;
       long tempHighestProduct = 1;


       
       while(true)
       {
           
            // if reached at the end it will end the loop
            if(ADJACENT + index > ch.length)
                break; 
            
            
            /*if( '0'  == ch[index + 12] ){
                index += 13;
                continue;
            }*/

            for(int i = 0; i < ADJACENT; i ++)
            {
                
                // calculate the multiply of the adjacent numbers
                
                temp1 = Character.getNumericValue(ch[index+i]);
                tempProduct *= temp1; // sum = sum * temp ;

            }
            
            System.out.print( index+"  ");
            System.out.print( tempHighestProduct);
            System.out.print("   " + tempProduct + "\n");
            
            // compare the highest and replace
            if(tempHighestProduct < tempProduct){
                tempHighestProduct = tempProduct;
                searchedIndex = index;
            }
       
            tempProduct = 1;
            index++;
       }
       System.out.println("The Highest Product is:"+tempHighestProduct);
       System.out.println("the searched index is:"+searchedIndex);
       
       
   }
   
 
    public static void main(String[] args) {
        
        String the1000digitNum = 
                  "73167176531330624919225119674426574742355349194934"
                + "96983520312774506326239578318016984801869478851843"
                + "85861560789112949495459501737958331952853208805511"
                + "12540698747158523863050715693290963295227443043557"
                + "66896648950445244523161731856403098711121722383113"
                + "62229893423380308135336276614282806444486645238749"
                + "30358907296290491560440772390713810515859307960866"
                + "70172427121883998797908792274921901699720888093776"
                + "65727333001053367881220235421809751254540594752243"
                + "52584907711670556013604839586446706324415722155397"
                + "53697817977846174064955149290862569321978468622482"
                + "83972241375657056057490261407972968652414535100474"
                + "82166370484403199890008895243450658541227588666881"
                + "16427171479924442928230863465674813919123162824586"
                + "17866458359124566529476545682848912883142607690042"
                + "24219022671055626321111109370544217506941658960408"
                + "07198403850962455444362981230987879927244284909188"
                + "84580156166097919133875499200524063689912560717606"
                + "05886116467109405077541002256983155200055935729725"
                + "71636269561882670428252483600823257530420752963450";

         char[] ch = the1000digitNum.toCharArray();
        
        func(13,ch );
        
    }
    
}
