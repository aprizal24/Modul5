/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak5;

/**
 *
 * @author rian
 */
public class BinaryTree {
    public Node root;
    
    public void NewNode(int data){
        root = NewNode(root, new Node(data));
    }
    
    private Node NewNode(Node root, Node newData) {
        
    if(root == null){
        root = newData;
        return root;
    }
    
    if(newData.data < root.data){
        root.left = NewNode(root.left, newData);
    } else {
        root.Right = NewNode(root.Right, newData);
    }
        return root;
    
    }
    
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.Right);
        }
    }
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.Right);
            System.out.print(node.data + " ");
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.Right);
        }
    }
}


