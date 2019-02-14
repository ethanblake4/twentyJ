package main;
import java.util.*;
public class Twenty {
    private static int[] b = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static Object[] o = new Object[]{new Random(), 0, b.length, false, b.length/4, "\n---------------", ' '};
    private static int f = (int)o[4];
    public static void main(String[] args){
        b[((Random)o[0]).nextInt((int)o[2])] = (((Random)o[0]).nextInt(2) + 1)*2;
        while((int)o[1] == 0) { o[6] = ' ';
            boolean d=false; for(int i:b) if(i==0) d = true; if(d) while(true) {
                int x = ((Random)o[0]).nextInt((int)o[2]);
                if(b[x]==0){b[x]=(((Random)o[0]).nextInt(2) + 1)*2; break;}
            }
            for(int i=0;i<f;i++){System.out.println((String)o[5]);for(int q=0;q<f;q++)System.out.print(b[i*4+q]+" | ");}
            switch ((char)(o[6]=o[6].equals(' ')? new Scanner(System.in).nextLine().charAt(0):o[6])) {
                case 'w':m(); break; case 'd':r();r();r();m();r(); break; case 's':r();r();m();r();r(); break;
                case 'a':r();m();r();r();r();break;
            }
            o[1]=1; for(int n=0;n<f;n++) {for(int i=0;i<(int)o[2];i++) if(b[i]==0 || i%4!=0&&b[i]==b[i-1]) o[1]=0; r();}
            if((int)o[1]==0) for(int i=0;i<(int)o[2];i++) if(i==2048) o[1]=2;
        }
        if((int)o[1]==1) System.out.println("You Lost"); else System.out.println("You won");
    }
    private static void m() { for(int i = 0; i<f; i++) v(); c(); v(); }
    private static void v() { for(int j=0;j<(int)o[2]-f;j++){ if(b[j]==0){b[j]=b[j+f];b[j+f]=0;}} }
    private static void c() { for(int j=0;j<(int)o[2]-f;j++){ if(b[j]==b[j+f]){b[j]+=b[j+f];b[j+f]=0;}} }
    private static void r() { int[]z=b.clone();for(int i=0;i<f;i++)for(int j=0;j<f;j++)z[i*4+j]=b[(f-j-1)*4+i];b=z;}
}