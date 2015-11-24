import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
      static int[] a=new int[10];
  public static void main(String[] args) {

    for(int i=0;i<5;i++){
      a[i]=i+1;     
    }
    //int[] a={1,2,5,7,11};
    int[] b={3,6,8,9,10};
    merge(a,b,5,5);
    //merge
  for(int i=0;i<10;i++){
      System.out.print(a[i]+",");
    }  
  }
  
  
  public static void merge(int[] a, int[] b, int n, int m){
    int aCurrent=0;
    int bCurrent=0;
    while(aCurrent<n && bCurrent<m){
      System.out.println("aCurrent item:\t"+a[aCurrent]+"  bCurrent item:\t"+b[bCurrent]);
      if(a[aCurrent]<b[bCurrent]){
        aCurrent++;//keep in it's place
      }else{//Copy b[bCurrent] in a[aCurrent's] position - Swap elements
        
        int tmp=a[aCurrent];
        a[aCurrent]=b[bCurrent];
        //shift values down in a
        for(int i=n;i>aCurrent+1;i--){
          a[i]=a[i-1];
        }  
        n++;
        aCurrent++;
          a[aCurrent]=tmp;
        bCurrent++;
        display();
        
      }
      while(bCurrent<m){
        a[n]=b[bCurrent];
        n++;
        bCurrent++;
      }
      System.out.println("aCurrent:\t"+aCurrent+" bCurrent:\t"+bCurrent);
    }
    
    
    
  }
  
  public static void display(){
     for(int i=0;i<10;i++){
      System.out.print(a[i]+",");
    }  
  }
  
  
}
