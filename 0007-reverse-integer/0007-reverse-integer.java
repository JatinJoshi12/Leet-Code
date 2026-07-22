class Solution {
    public int reverse(int x) {
        long rev=0;
        int k=Math.abs(x);
        for(int i=k;i>0;i/=10)
        {
            rev=rev*10+(i%10);
        }
        if(x<0)
        {
            rev=-rev;
        }
        if(rev>=Math.pow(2,31)-1||rev<=Math.pow(-2,31))
            return 0;
        else
            return (int)rev;
    }
}