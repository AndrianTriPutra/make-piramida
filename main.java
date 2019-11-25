/*
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************

*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
*/

import paket.generate;
import java.util.Scanner;

class main{
    public static void main(String args[]){
        try{
            Scanner scan=new Scanner(System.in);
        
            System.out.print("Masukkan berapa lantai piramid (value >= 2):");
            String data=scan.nextLine();
            int lantai=Integer.parseInt(data);
            
            if(lantai>=2){
                generate piramid = new generate();
                piramid.tegap(lantai);
                System.out.println();
                piramid.terbalik(lantai);
            }
            else
                throw new Exception("value kurang dari 2 lantai");    
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Program Stop");
        }

    }
}

