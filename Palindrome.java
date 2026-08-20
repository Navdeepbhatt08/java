public class Palindrome
{
    public static void main(String [] args)
    {
        String x = "NAMAN";
        int l = x.length();

        int i =0, j = l-1;
int f = 0;
        while(i<j)
        {
            if(x.charAt(i)!= x.charAt(j))
            {
                f = 1;
                break;
            }
            i++; j--;
        }

         if (f == 0) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }
}