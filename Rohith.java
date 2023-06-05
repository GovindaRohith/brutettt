// Given an array arr[] of N integers.
// Find the contiguous sub-array(containing at least one number)
// which has the minimum sum and return its sum.

// Example 1:

// Input: 
// arr[] = {3,-4, 2,-3,-1, 7,-5}
// Output: -6
// Explanation: sub-array which has smallest 
// sum among all the sub-array is {-4,2,-3,-1} = -6
// Example 2:

// Input:
// arr[] = {2, 6, 8, 1, 4}
// Output: 1
// Explanation: sub-array which has smallest
// sum among all the sub-array is {1} = 1
import java.io.*;
class Side
{
    public int smallest(int n,int arr[])
    {
        int min=arr[0],counter=0,pre=1,post=1;
        for(pre=1;pre<=n;pre++)
        {
            counter=0;
            for(post=pre;post<n;post++)
            {
                counter=counter+arr[post];
                if(counter<min) min=counter;
            }
        }
        return min;
    }
}
class Rohith {
    public static void main(String args[])throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n,i;
        System.out.println("Enter any number");
        n=Integer.parseInt(in.readLine());
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
        }
        Side ob=new Side();
        System.out.println(ob.smallest(n, arr));
    }
}
