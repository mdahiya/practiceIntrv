

import java.util.Stack;

public class DFS{
	private final int MAX_VERTS = 5;
	private Vertex[] vertexList; // array of vertices
	int[][] adjMat;
	int nVertices;//current no. of vertices



public DFS(){

	vertexList=new Vertex[9];
	adjMat=new int[9][9];
	nVertices=0;
	for(int i=0;i<MAX_VERTS;i++){
		for(int j=0;j<MAX_VERTS;j++){
			adjMat[i][j]=0;
		}
	}
}


public void dfs(){// depth first search
	vertexList[0].isVisited=true;
	Stack dfsStack=new Stack<Integer>();
	DisplayVertex(0);
	dfsStack.push(0);
	
	while(!dfsStack.isEmpty()){
		int adjVertex=getAdjUnivistedVertex((int)dfsStack.peek());
		if(adjVertex>=0){
			vertexList[adjVertex].isVisited=true;
			dfsStack.push(adjVertex);
			DisplayVertex(adjVertex);
		}else{
			dfsStack.pop();
		}
		
	}
		// stack is empty, so we’re done
		for(int j=0; j<nVertices; j++) // reset flags
			vertexList[j].isVisited = false;


	

}
public static void main(String[] args){
		DFS theGraph=new DFS();
		theGraph.addVertex('A'); 
		theGraph.addVertex('B'); 
		theGraph.addVertex('C'); 
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addEdge(0, 1); 
		theGraph.addEdge(1, 2); 
		theGraph.addEdge(0, 3); 
		theGraph.addEdge(3, 4);		
		theGraph.DisplayAdjMatrix();
		theGraph.DisplayVertexList();
		System.out.println("Visited Nodes are :\t");
		theGraph.dfs();

	}
public void addVertex(char c){
	vertexList[nVertices]=new Vertex(c);
	nVertices++;

}

public void addEdge(int start,int end){
	adjMat[start][end]=1;
	adjMat[end][start]=1;
}



public int getAdjUnivistedVertex(int v){
	for(int i=0;i<nVertices;i++){
		System.out.println("v:\t"+v+"i:\t"+i+"nVertices:\t"+nVertices+"adjMat[v][i]:\t"+adjMat[v][i]+"vertexList[i].isVisited:\t"+vertexList[i].isVisited);
		if(adjMat[v][i]==1 && vertexList[i].isVisited==false){
			return i;
		}
	}
	return -1;
}


public void DisplayVertex(int v){
	System.out.println(vertexList[v].nodeName +":"+vertexList[v].isVisited);
}

public void DisplayVertexList(){
	for(int i=0; i<nVertices;i++)
		System.out.println(vertexList[i].nodeName);
}
public void DisplayAdjMatrix(){
	for(int i=0;i<MAX_VERTS;i++){
		for(int j=0;j<MAX_VERTS;j++){
			System.out.print(adjMat[i][j]+"\t");
		}
		System.out.println();
	}

}	

}



class Vertex{
	char nodeName;
	boolean isVisited=false;

	public Vertex(char c){
		this.nodeName=c;
		this.isVisited=false;
	}
}