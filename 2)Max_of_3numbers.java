class MaxOfNumbers
{
    public static void main(String[] args)
    {
        int n1=4,n2=10,n3=31,max;
        max=((n1>n2 && n1>n3))?n1:(n2>n3)?n2:n3;
        System.out.println("max of "+n1+","+n2+" and "+n3+" is "+max);
    }
}
