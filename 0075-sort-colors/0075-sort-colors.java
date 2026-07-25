class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int zero=0,one=0,two=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i<zero)
            {
                arr[i]=0;
            }
            else if(i<(zero+one))
            {
                arr[i]=1;
            }
            else
            arr[i]=2;
        }
    }
}