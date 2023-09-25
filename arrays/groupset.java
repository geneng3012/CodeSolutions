import java.util.*;

public class groupset{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];

        int i,j,count;
        count=0;

        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        // for(i=0;i<size;i++){
        //     for(j=i+1;j<size;j++){
        //         if(arr[i]>arr[j]){
        //             temp=arr[i];
        //             arr[i]=arr[j];              //correct
        //             arr[j]=temp;
        //         }
        //     }
        //    }

        int x=0;

        int temp=0;
        int cop[]=new int[size];
        
        int max=0;
        int arrcount=0;

        for(i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==0){
                cop[x]=arr[i];
                arrcount++;
                x++;
            }
            count=0;
        }

        x=0;
       // System.out.println(arrcount);
        count=0;

        // for(i=0;i<arrcount;i++){
        //     System.out.println(cop[i]);
        // }

        for(i=0;i<arrcount;i++){
            for(j=0;j<size;j++){
                if(cop[i]==arr[j]){
                    System.out.print(j +"group"+(i+1)+" " );
                    count++;
                }
                //System.out.print("i"+i+" count"+count+"j"+j+" ");
                if(count%cop[i]==0){
                    System.out.println();
                    //count=0;
                }
            }
            if(count%cop[i]!=0){
                break;
            }
            count=0;
        }

        
        
       // System.out.println("m"+max);

        


       

    }
}