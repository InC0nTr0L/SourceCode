/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahome;

import java.io.*;
import java.util.*;

class BinaryNode
{
     BinaryNode right,left;
     int data;
     BinaryNode(int item)
     {
         data=item;
         left = right = null;
     }
}

public class BinaryTree {
    
    BinaryNode root;
    
    public void binarycheck(BinaryNode node, int val)
    {
        int path[] = new int[1000];
        int value = val;
        traversepath(node, path, 0, val);
    }
    
    public void traversepath(BinaryNode node, int path[], int len, int value)
    {
        if(node==null)
        return;
        
        path[len]=node.data;
        len++;
        
        if(node.left == null && node.right == null)
            printtree(path, len, value);
        else
        {
            traversepath(node.left, path, len ,value);
            traversepath(node.right, path, len, value);
        }
    }
    
    public void printtree(int path[], int len, int value)
    {
        int i,sum=0,sumval=value;
        for(i=0;i<len;i++)
        {
            sum=sum+path[i];
        }
        if(sum==sumval)
        {
            for(i=0;i<len;i++)
        {
            System.out.print(path[i]+" ");
        }
        System.out.println("#SUM IS :"+sum);
        System.out.println("");
        }
        
        
    }

public static void main(String args[])
{
    BinaryTree tree = new BinaryTree();
    tree.root = new BinaryNode(10);
    tree.root.left = new BinaryNode(8);
    tree.root.right = new BinaryNode(2);
    tree.root.left.left = new BinaryNode(3);
    tree.root.left.right = new BinaryNode(5);
    tree.root.right.left = new BinaryNode(2);  
    
    Scanner scan = new Scanner(System.in);
    int s;
    System.out.println("ENTER THE SUM :");
    s = scan.nextInt();
    
    tree.binarycheck(tree.root, s);
}
}
