int[][] trim(int[][] grid, int rows, int cols) {
    int[][] trimmedArray = new int[rows][cols];
    int i2 = 0;
    int j2 = 0;
    for(int i = grid.length-rows;i<grid.length;i++){
        for(int j = grid[0].length-cols;j<grid[0].length;j++){
            trimmedArray[i2][j2] = grid[i][j];
            j2++;
        }
        i2++;
        j2=0;
    }
    return trimmedArray;
}
