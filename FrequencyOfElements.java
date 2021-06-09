package JavaCodes;

import java.util.Scanner;

public class FrequencyOfElements
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int fr[]= new int[n];

        int visited=-1;
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==arr[i])
                {
                    count++;
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited)
            {
                fr[i]=count;
            }
        }

        System.out.println("Element ||  Frequency");
        for(int i=0;i<n;i++)
        {
            if(fr[i]!=visited)
            {
                System.out.print(arr[i]+ "       ||     " + fr[i]);
            }
            System.out.println();
        }

    }
}
