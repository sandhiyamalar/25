import java.io.*;
import java.util.*;
class G13{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int flag=1,temp;
        for(int i=2;i<=n;i++){
            temp=n%i;
            if(temp==0){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}


