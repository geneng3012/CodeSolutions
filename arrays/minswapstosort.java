import java.util.*;

public class minswapstosort{
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int count=0;

        int i,j;

        int arr[]=new int[x]; //{1,5,1,3,2}    
        int copy[]=new int[x];//{1,1,2,3,5}

        for(i=0;i<x;i++){
           //arr[i]=sc.nextInt();
           copy[i]=arr[i];
        }

        for(i=0;i<x;i++){
            for(j=i+1;j<x;j++){
               
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        // for(i=0;i<x;i++){
        //     System.out.println(arr[i]);
        //  }

        for(i=0;i<x;i++){
            for(j=i+1;j<x;j++){
                if(copy[i]==arr[i]){
                    break;
                }
                if(arr[i]==copy[j]){
                    int temp=copy[j];
                    copy[j]=copy[i];
                    copy[i]=temp;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}