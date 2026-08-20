    class RevStr
    {
        public static void main(String[] args)
        {
            String s = "Navdeep";
            String reversed = "";
            
            for(int i = s.length()-1;i>=0;i--)
            {
                reversed = reversed + s.charAt(i);
            }
        System.out.println("String = "+s.toLowerCase());
        System.out.println("Reversed = "+reversed.toLowerCase());
        }
    }