package paket;

public class generate{
    int a,b,c,d;

    public void terbalik(int floor){
        for(a=floor; a>=1; a--){
            for(b=a; b<=floor; b++){
                System.out.print(" ");
            }
            c=a+a-1;
            for(d=1; d<=c; d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void tegap(int floor){
        for(a=1; a<=floor; a++){
            for(b=a; b<=floor; b++){
                System.out.print(" ");
            }
            c=a+a-1;
            for(d=1; d<=c; d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}