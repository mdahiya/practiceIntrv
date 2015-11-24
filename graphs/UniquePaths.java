// Given n*m grids, count the unique paths from top-left grid to bottom-right, path can only go to right or to bottom.
// Samples:
// input: 2, 2
// output: 2
// input: 3, 4
// output: 10
// function countPath(n, m) {
// }

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class UniquePaths{
  
  int[][] adjMatrix;
  List<Vertex> vertexList;
  int noVertex;
  
  public UniquePaths(int n, int m){
    adjMatrix=new int[n][m];
    vertexList =new ArrayList<Vertex>(n*m);
    noVertex=n*m;
  }
  
  public static void main(String[] args){
    int noRows=2;//for 
    int noCols=2;
    
    //System.out.println(findPaths(4,5));
    //System.out.println(findPathsWoRec(4,5));
    UniquePaths up=new UniqueuePaths(noRows, noCols);
    // //Set adj matrix
     up.fillAdjMatrix(noRows, noCols);
    
    // //Set vertex List
     up.setVertexList(n*m);
    
     up.displayGraph(noRows, noCols);
    
    
  }
public static int  findPathsWoRec(int n, int m){
      int cntr=0;
      //move up for each column position and then right when at row 1
      for(int i=m;i>0;i--){ //column left
          for (int j=n;j>0;j--){//row up
              if(j==1 || j==1){
                  //shift right till 0,0
                  cntr++;

              }

          }
        }
        System.out.println("Column left:\t"+cntr);

          for (int j=n;j>0;j--){//row up
            for(int i=m;i>0;i--){ //column left
              if(i==1 || j==1){
                  //shift right till 0,0
                  cntr++;

              }

          }
        }
         System.out.println("row up:\t"+cntr);

         //for eeach column shift up and and tehn shift right
     return cntr;
     //return  findPaths(m-1, n) + findPaths(m, n-1); 


  }


  public static int  findPaths(int n, int m){
    if(m==1|| n==1){
      return 1;
    }
     return  findPaths(m-1, n) + findPaths(m, n-1); 


  }
  
  public void fillAdjMatrix(int n, int m){
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          adjMatrix[i][j]=1;
          
        }
        
      }  
      
  }
  
  public void setVertexList(int size){
    for(int i=0;i<size;i++){
      vertexList.add(new Vertex(i));
    }
    
  }
  
  //display graph - DFS
  public  void displayGraph(int n, int m){
    //Start with first node --> Go right --->bottom--> (example 2X 2 matrix), go bottom --> then go right. (end case when when array indexes are n and m)
    //else we can go right or bottom from each point. mark each point as visited and add to stack
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

    
    //while displaying pop it from stack
    
    
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

  
  //Find unvisisted Nodes
  public  int findUnvisitedNodes(int vertex){
    //if already visited return false
    for(int j=0;j<noVertex;j++){
    if(adjMatrix[vertex][j]==1 && vertexList.get(j).isVisted==false){
      vertexList.get(j).isVisted=true;
      return j;
    }
      
    
    }
    //else mark it visisted
    return -1;
    
    
  }
  

  
}

class Vertex{
  int data;//node number
  boolean isVisted;
  
  public Vertex(int data){
    this.data=data;
    this.isVisted=false;
  }
  
}