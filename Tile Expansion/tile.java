double[][] tile(double[][] grid, int n) {
    int r = grid.length;
    int c = grid[0].length;
    double[][] tile = new double[r*n][c*n];
    
    for(int i = 0;i<r*n;i++){
        if(i<r){
            for(int j = 0;j<c*n;j++){
                if(j<c){
                    tile[i][j]=grid[i][j];
                }
                else{
                    tile[i][j]=grid[i][j%c];
                }
            }
        }
        else{
            for(int j = 0;j<c*n;j++){
                if(j<c){
                    tile[i][j]=grid[i%r][j];
                }
                else{
                    tile[i][j]=grid[i%r][j%c];
                }
            }
        }
        
    }
    return tile;
}

/*
int n2 = n;
    int x = 0;
    int y = 0;
    double[][] tile = new double[n*grid.length][n*grid[0].length];
    for(int i = 0;i<n;i++){
        for(int j = 0;j<grid.length;j++){
            for(int l = 0;l<grid[0].length;l++){
                tile[x][y]=grid[j][l];
                x++;
            }
            y++;
        }
    }
    return tile;
    */ //code
/*

Example original array:
[[2, 3, 7],
 [9, 8, 1]]

Example result array:
[[2,3,7,  2,3,7,  2,3,7],
 [9,8,1,  9,8,1,  9,8,1],
 
 [2,3,7,  2,3,7,  2,3,7],
 [9,8,1,  9,8,1,  9,8,1],

 [2,3,7,  2,3,7,  2,3,7],
 [9,8,1,  9,8,1,  9,8,1]]
 
 with n = 3

(The additional spacing in the 6x9 array above is simply for
 clarity, not a property of the actual array.)

(The example above uses ints, although the actual type does not.)

*/ //intructions
