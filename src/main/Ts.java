package main;import java.util.*;public class Ts{int[]b=new int[16];int v,i,j,q,s,u;public static void main(String[]a){new Ts().k();}void k(){b[r()]=2;while(v<1){u=0;for(;;)if(b[s=r()]<1){b[s]=2;break;}for(q=0;q<16;)System.out.printf("%4d|%s",b[q++],q%4<1?"\n––––––––––––––––––––\n":"");for(i=0;i<4;r())if("wasd".indexOf((u=u<1?new Scanner(System.in).next().charAt(0):u))==i++){v();v();v();for(q=0;q<12;)if(b[q]==b[q+++4]){b[q-1]*=2;b[3+q]=0;}v();}v=1;for(q=0;q<4;q++,r())for(i=0;i<16;i++)if(b[i]<1||i%4!=0&&b[i]==b[i-1])v=0;if(v<1)for(i=0;i<16;v=b[i++]==2048?2:v);}System.out.println("You "+(v<2?"lost":"won"));}void v(){for(j=0;j<12;j++)if(b[j]<1){b[j]=b[j+4];b[j+4]=0;}}int r(){int[]z=b.clone();for(s=0;s<4;s++)for(j=0;j<4;)z[s*4+j++]=b[16-j*4+s];b=u>0?z:b;return new Random().nextInt(16);}}