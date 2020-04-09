import java.util.Scanner;
public class NumberAscending
{
    public static void main(String args[])
    {
        int n, r = 0, c = 0, p, t;
        int arr[];
        int min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        p = n = sc.nextInt();
        
        while(n != 0)
        {
            r = n%10;
            n = n/10;
            c = c + 1;
        }
        if(c<3)
        {
            System.out.println("Enter a number having more than 3 digits");
        }
        else
        {
            System.out.println(c);
            arr = new int [c];
            int i = 0;
            while(p != 0)
            {
                r = p%10;
                
                arr[i] = r;
                p = p/10;
                i++;
            }
            
            for(i = 0;i < (c - 1);i++)
            {
                min = i;
                for(int j = i + 1;j < c;j++)
                {
                    if(arr[j]<arr[min])
                    min = j;
                }
                t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
            
            for(i = 0;i < c;i++)
            System.out.print(arr[i] + ",");
            
        }
        
    }
}
                