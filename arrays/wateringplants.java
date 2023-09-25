import java.util.*;

public class wateringplants{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        int arr[]=new int[x];
        int i,j;
        int store=0;
        int steps=0;

        for(i=0;i<x;i++){
            System.out.println("enter element "+i);
            arr[i]=sc.nextInt();
        }

        System.out.println("enter cap");
        int cap=sc.nextInt();
        int capcopy=cap;

        // for(i=0;i<x;i++){
        //     System.out.println(i);

           
        //    if(cap>=arr[i]){
        //         cap=cap-arr[i];
        //         steps++;
        //    }                                                                       //sol1
        //    if(i!=x-1){
        //      if(cap<arr[i+1]){
        //             store=i;
        //             steps=steps+i+1;
        //             cap=capcopy;
        //             steps=steps+i+1;
        //             continue;
        //         }
        //     }
            
        // } {2,2,3,3}\


        for(i=0;i<x;i++){
           
           // System.out.println("steps"+steps);
           
            if(i<store){              
                System.out.println("store"+store +" ibefore "+i +" stepbefore "+steps);
                //i++;
                steps++;
                System.out.println("store"+store +" iafter "+i +" stepafter "+steps);
                continue;
            }
            
            if(cap>=arr[i]){
                cap=cap-arr[i];
                steps++;      
            }


            if(i!=x-1){
                if(cap<arr[i+1] ){
                    steps=steps+i+1;
                    store=i+1;
                    cap=capcopy;
                    i=-1;
                    continue;
                
                }
            }

           
        }

        System.out.println(steps);

        



    }
}