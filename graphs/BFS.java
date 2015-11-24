import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class BFS{
	private final int MAX_VERTICES=9;
	int[][] adjMatrix;
	ArrayList<BFSNode> bfsVertexList;
	private int nVertices;

	public BFS(int size){
		adjMatrix=new int[size][size];
		nVertices=0;
		bfsVertexList=new ArrayList<BFSNode>();
	}

	public void addVertex(char c){
		BFSNode bfsNode=new BFSNode(c);
		bfsVertexList.add(bfsNode);
		nVertices++;

	}

	public void addEdge(int start,int end){
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;

	}

	public void bfsGraph(){
		//visit all adjacent node 
		Queue<Integer> bfsQueue=new LinkedList<Integer>();
		//Add 0 as first Node
		bfsQueue.add(0);
		bfsVertexList.get(0).isVisited=true;//mark node as visited
		//if all are visited then visited adjacent node of next node
		//if none left then exit
		while(!bfsQueue.isEmpty()){
			int adjNode=getUnvisistedAdjNode(bfsQueue.remove());

			if(adjNode>=0){
				bfsQueue.add(adjNode);
				bfsVertexList.get(adjNode).isVisited=true;
				displayVertex(adjNode);
			}else{
				//bfsQueue.remove();
				System.out.print("Path:\t"+bfsQueue.remove());
			}

		}


	}

	public int getUnvisistedAdjNode(int v){

		for(int i=0;i<nVertices;i++){
			System.out.println("getUnvisistedAdjNode v:\t"+v+"\t nVertices: \t"+nVertices+"\t cntr:\t"+i+"\t adj matrix:\t"+adjMatrix[v][i]+"\t is Visisted?:\t"+bfsVertexList.get(i).isVisited);
			if(adjMatrix[v][i]==1 && bfsVertexList.get(i).isVisited==false){
				return i;
			}
		}


		return -1;
	}

	public void displayVertex(int v){
		
		System.out.println((bfsVertexList.get(v).nodeName)+":"+(bfsVertexList.get(v).isVisited));
	}

	public void displayAdjMatrix(){
		for(int i=0;i<nVertices;i++){
			for(int j=0;j<nVertices;j++){
				System.out.print(adjMatrix[i][j]+"\t");
			}
			System.out.println();
		}
	}


	public static void main(String[] args){
		BFS theGraph=new BFS(5);
		theGraph.addVertex('A'); 
		theGraph.addVertex('B'); 
		theGraph.addVertex('C'); 
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addEdge(0, 1); 
		theGraph.addEdge(1, 2); 
		theGraph.addEdge(0, 3); 
		theGraph.addEdge(3, 4);		
		theGraph.displayAdjMatrix();
		theGraph.displayVertex(0);
		System.out.println("Visited Nodes are :\t");
		theGraph.bfsGraph();

	}


}


/*
* Node Class for Depth first Search
*/
class BFSNode{
	char nodeName;
	boolean isVisited;

	public BFSNode(char c){
		this.nodeName=c;
		this.isVisited=false;

	}

}