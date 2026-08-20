class EqualsString 
{
    public static void main(String[] args)

{
    String s1 = "XYZ";
    boolean t = s1.equals("XYZ"); //true
    boolean t1 = s1.equals("xyz");  //false
    boolean t2 = s1.equalsIgnoreCase("xyz");  //true


    System.out.println(t);
    System.out.println(t1);
    System.out.println(t2);
}
}