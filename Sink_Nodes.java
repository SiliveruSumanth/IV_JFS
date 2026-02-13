public class Sink_Nodes {
    public static int sink(int arr[][]) {
        int count=0;
        for(int row=0;row<arr.length;row++){
            boolean b=true;
            for(int col=0;col<arr[0].length;col++){
                if(arr[row][col]==1){
                    b=false;
                    break;
                }
            }
            if(b){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int adj_mat[][]={{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,1,0,0},{0,0,0,0,0}};
        System.out.println("The total_no.of sink nodes are : "+sink(adj_mat));
    }
}
