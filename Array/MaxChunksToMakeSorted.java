public class MaxChunksToMakeSorted {
//    notice the property of permutation
    public int maxChunksToSorted(int[] arr) {
        int max = 0, res = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>=max)
                max = arr[i];
            if(max == i)
            {
                res+=1;
                max +=1;
            }

        }
        return res;
    }
}
