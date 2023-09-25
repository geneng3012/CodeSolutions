import java.util.*;

public class minsum{
    public static void main(String[] args) {
       
       
        int i,j;
        int sum=0;
        int store=0;
        int count=0;
        int ic=0;
        int jc=0;

       
       
        int nums1[]={1,7,11};
        int nums2[]={2,4,6};



        for(i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
                sum=nums1[i]+nums2[j];
                if(count==0){
                    store=sum;
                    ic=i;
                    jc=j;
                    count=1;
                    
                }
                if(sum<store){
                    store=sum;
                    ic=i;
                    jc=j;
                }
                System.out.println(sum);
                sum=0;
            }

            System.out.println("{"+nums1[ic]+nums2[jc]+"}");
            System.out.println("s"+store);
            store=0;
            count=0;
            sum=0;
            
        }
    }
}