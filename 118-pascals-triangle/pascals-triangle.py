class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        out_list = []
        for i in range(numRows):
            row = [1] * (i+1)
            for j in range(1,i):
                row[j] = out_list[i-1][j-1] + out_list[i-1][j]
            out_list.append(row)
        
        return out_list