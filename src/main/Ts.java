package main;import java.util.*;public class Ts{int[]b=new int[16];int v=0;int u=' ';public static void main(String[]a){new Ts().k();}void k(){b[m()]=2;while(v==0){u=' ';int d=0;for(int i:b)if(i==0)d=1;if(d==1)while(true){int x=m();if(b[x]==0){b[x]=2;break;}}for(int i=0;i<4;i++){System.out.println("\n––––––––––––––––––––");for(int q=0;q<4;q++)System.out.printf("%4d|",b[i*4+q]);}for(int i=0;i<4;i++){if("wasd".indexOf((u=u==' '?new Scanner(System.in).next().charAt(0):u))==i){v();v();v();for(int j=0;j<12;j++){if(b[j]==b[j+4]){b[j]*=2;b[j+4]=0;}}v();}r();}v=1;for(int n=0;n<4;n++){for(int i=0;i<16;i++)if(b[i]==0||i%4!=0&&b[i]==b[i-1])v=0;r();}if(v==0)for(int i=0;i<16;i++)if(b[i]==2048)v=2;}System.out.println("You "+(v==1?"won":"lost"));}void v(){for(int j=0;j<12;j++){if(b[j]==0){b[j]=b[j+4];b[j+4]=0;}}}void r(){int[]z=b.clone();for(int i=0;i<4;i++)for(int j=0;j<4;j++)z[i*4+j]=b[(3-j)*4+i];b=z;}int m(){return new Random().nextInt(16);}}