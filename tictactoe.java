package demo;

public class tictactoe {
    public tictactoe() {
        super();
    }
    int arr[][]=new int[3][3];
    public boolean hasWon(int check,int dim){

        for (int i=0;i<3;i++){
            if(check==0){//horizontal check 0,0 with
                for(int j=1;j<dim;j++){
                    if(arr[i][0]==arr[i][j])
                        return true;
                }
            }
            if(check==1){
                for(int j=1;j<dim;j++){//
                    if(arr[0][i]==arr[j][i])
                        return true;
                }
            }
            if(check==2){
                for(int j=1;j<dim;j++){
                    if(arr[0][0]==arr[j][j])
                        return true;
                }
            }
            if(check==3){
                for(int j=dim-2;j>=0;j--){
                    if(arr[dim-1][dim-1]==arr[j][j])
                        return true;
                }
            }
        }
          return false;
        }


}
