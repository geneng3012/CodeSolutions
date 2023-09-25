import java.util.*;

public class minnumofjumps{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i,j,x,count;
        count=0;
        int max=1;
        int maxpos=0;


        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
      
        //int arr[]={1 ,3 ,5, 8, 9, 2, 6, 7, 6, 8, 9};
        

        for(i=0;i<n-1;i++){

            if(arr[i]+arr[i+arr[i]]>=n-1){
                count=count+2;
                break;

            }
            x=i+1;
            if(i+arr[i]==n-1){
                count++;
                break;
            }
            
            if(i==0){
                if(arr[i]>=n-1){
                count++;
                break;
                }
            }
            
            for(j=0;j<arr[i];j++){
                if(x<n){
                    if(arr[x]>=max){
                        max=arr[x];
                        maxpos=x;
                    }
                }
               // System.out.println(arr[i]);
                x++;
            }

           

            System.out.println("maxpos: "+maxpos);
            System.out.println("max: "+arr[maxpos]);

            
            if(max==1 && maxpos==0){
                i=i+arr[i]-1;
                count++;
                continue;
            }
            
           

            if(n-arr[i]<n-1-maxpos && arr[i]>arr[maxpos]){
                System.out.println("case 1 " +i);
                x=i+arr[i];
                if(arr[x]!=0){
                    i=i+arr[i]-1;
               
                count++;
                max=1;
                //System.out.println("case 2 " );
                maxpos=0;
                System.out.println("case 1 " +i +" a "+arr[i] );
                continue;
                
                }
                
                
               
            }
           
           


            i=maxpos-1;
            count++;
            if(maxpos==n-1){
                break;
            }
            if(arr[maxpos]>=n-1-maxpos){
                System.out.println("case");
                count++;
                break;
            }
            max=1;
            maxpos=0;
        }

        System.out.println(count);


    }
}