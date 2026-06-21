class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char num = board[row][col];
                if (num == '.') {
                    continue;
                }
                String rowKey = "row" + row + num;
                String colKey = "col" + col + num;
                String boxKey = "box" + (row / 3) + (col / 3) + num;
                if (seen.contains(rowKey) ||
                    seen.contains(colKey) ||
                    seen.contains(boxKey)) {
                    return false;
                }
                seen.add(rowKey);
                seen.add(colKey);
                seen.add(boxKey);
            }
        }
        return true;
    }
}