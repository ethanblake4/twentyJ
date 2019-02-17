package main;
import java.util.*;
public class Twenty {
    private static int[] b = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private static Object[] o = new Object[]{0, b.length, "\n---------------", ' '};
    private static int f = b.length/4;
    public static void main(String[] args) throws java.io.IOException {
        b[new Random().nextInt((int)o[1])] = 2;
        while((int)o[0] == 0) { o[3] = ' ';
            int d=0; for(int i:b) if(i==0) d = 1; if(d==1) while(true) {
                int x = new Random().nextInt((int)o[1]);
                if(b[x]==0){b[x]=2; break;}
            }
            for(int i=0;i<f;i++){System.out.println((String)o[2]);for(int q=0;q<f;q++)System.out.print(b[i*4+q]+" | ");}
            for(int i=0;i<4;i++){if("wasd".indexOf((int)(o[3]=o[3].equals(' ')? System.in.read():o[3])) == i) m();r();}
            o[0]=1; for(int n=0;n<f;n++) {for(int i=0;i<(int)o[1];i++) if(b[i]==0 || i%4!=0&&b[i]==b[i-1]) o[0]=0; r();}
            if((int)o[0]==0) for(int i=0;i<(int)o[1];i++) if(b[i]==2048) o[0]=2;
        }
        if((int)o[0]==1) System.out.println("You Lost"); else System.out.println("You won");
    }
    private static void m() { for(int i = 0; i<f; i++) v(); c(); v(); }
    private static void v() { for(int j=0;j<(int)o[1]-f;j++){ if(b[j]==0){b[j]=b[j+f];b[j+f]=0;}}}
    private static void c() { for(int j=0;j<(int)o[1]-f;j++){ if(b[j]==b[j+f]){b[j]*=2;b[j+f]=0;}}}
    private static void r() { int[]z=b.clone();for(int i=0;i<f;i++)for(int j=0;j<f;j++)z[i*4+j]=b[(f-j-1)*4+i];b=z;}
}