class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        

   
            List<Integer> arr = new ArrayList<>();

        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol<=endcol)
        {

            for(int i = startcol ;i<=endcol ;i++)
                arr.add(matrix[startrow][i]);
            
            startrow++;

            for(int i=startrow ;i<=endrow;i++)
                arr.add(matrix[i][endcol]);
            
            endcol--;

            if(startrow <= endrow)
            {
                for(int i=endcol ;i>=startcol ;i--)
                    arr.add(matrix[endrow][i]);

                endrow--;
            }
            if(startcol <= endcol)
            {
                for(int i=endrow ;i>=startrow;i--)
                {
                    arr.add(matrix[i][startcol]);
                }
                startcol++;
            }

        }

        return arr;
    }
}
