Que -> Given a square matrix[][] of size N x N. 
      The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

static void rotate(int matrix[][]) 
    {
        int n=3;
        while(n-->0){
          for(int i=0;i<matrix.length;i++){
              for(int j=i;j<matrix.length;j++){
                int temp =  matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
              }
          }

          for(int i=0;i<matrix.length;i++){
              for(int j=0;j<(matrix.length/2);j++){
                  int temp=matrix[i][j];
                  matrix[i][j]=matrix[i][matrix.length-j-1];
                  matrix[i][matrix.length-j-1] = temp;
              }
          }
       }
    }
