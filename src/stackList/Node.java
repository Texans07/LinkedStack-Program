/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackList;

/**
 *
 * @author Doug
 */
// Making a class for the node//
public class Node {
    
    private int data;
    private Node link;
    //calling the node function
    public Node()
    {
        link = null;
        data = 0;
    }    
    //  making node Function  
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    // making function to set link to next Node  
    public void setLink(Node n)
    {
        link = n;
    }    
    // making function to set data to current Node  
    public void setData(int d)
    {
        data = d;
    }    
    // making function to get link to next node  
    public Node getLink()
    {
        return link;
    }    
    //  making function to get data from current Node  
    public int getData()
    {
        return data;
    }
}
