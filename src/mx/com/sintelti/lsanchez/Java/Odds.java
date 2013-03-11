package mx.com.sintelti.lsanchez.Java;
import java.util.*;

public class Odds {

    public static void main(String[] args) {

    int  x, i;
    int  Vn[]=  { 1000, 900, 500, 400,100, 90, 50, 40,
                  10, 9, 5, 4, 1 };
    String Vc[]={"M","CM","D","CD","C","XC","L","XL",
                   "X","IX","V","IV","I"};
      
      Scanner in = new Scanner( System.in );
      System.out.print("Ingresa numero ");
          while( true ){
          x = in.nextInt();
          if( x==0 )
              break;
        
          i = 0;
          while( x>0 ){
              if( x>=Vn[i] ){
                  System.out.print( Vc[i] );
                  x = x - Vn[i];
              }
              else
                  i++;
          }
          System.out.println();
      }
   }
}
