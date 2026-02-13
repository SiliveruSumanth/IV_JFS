import java.util.ArrayList;
import java.util.List;

public class Sink_Dynamically {
    public static int Sink(List <List<Integer>> adj){
        int count=0;
        for(int i=0;i<adj.size();i++){
            if(adj.get(i).size()==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int V=5;
        List<List<Integer>> adj=new ArrayList<>();
        
        for (int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(0).add(4);
        adj.get(1).add(3);
        adj.get(2).add(4);
		adj.get(2).add(3);

        System.out.println("The no.of sink nodes are : "+Sink(adj));

    }
}
