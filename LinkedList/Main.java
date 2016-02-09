class Node{
    private Node nextNode;
    private int data;
    
    public void setNextNode(Node node){
        this.nextNode=node;
    }
    public Node getNextNode(){
        return this.nextNode;
    }
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return this.data;
    }
}

class MyLinkedList{
    Node head;
    
    public void add(int data){
        if( head == null){
            head = new Node();
            head.setData(data);
        }else{
            Node currentNode = new Node();
            currentNode.setData(data);    
            Node headNode = head;
        
            while(headNode.getNextNode()!=null){
                headNode = headNode.getNextNode();
            }
        
            headNode.setNextNode( currentNode );
        }
    }
    
    public void addAfter( int data, int insertAfter ){
        Node currentNode=head;
        Node prevNode=null;
        Node newNode = new Node();
        newNode.setData(data);
        int counter=0;
        if(head==null){
            head=newNode;
        }else{
            while(currentNode!=null){
                if(counter==i){
                    if(currentNode==head){
                        if(currentNode.getNextNode()!=null){
                            head=currentNode.getNextNode();
                        }else{
                            head=null;
                        }
                    }else{
                        if( currentNode.getNextNode()!=null ){
                            prevNode.setNextNode(currentNode.getNextNode());    
                        }else{
                            prevNode.setNextNode(null);
                        }
                    }
                }else{
                    prevNode=currentNode;
                    currentNode=currentNode.getNextNode();
                }
                counter++;
            }
        }
    }
    
    public void traverse(){
        if(head == null ){
            System.out.println("The head node is null");
            
        }else{
            Node currentNode = head;
            while(currentNode.getNextNode()!=null){
                System.out.println("The node value is "+currentNode.getData());
                currentNode=currentNode.getNextNode();
            }
            System.out.println("The node value is "+currentNode.getData());
        }
    }
    
    public int get(int i){
        int counter = 0;
        int data=-1;
        Node currentNode=head;
        if( head == null ){
            System.out.println("The list is empty");
        }else{
            do{
                if(counter==i){
                    data = currentNode.getData();
                    break;
                }else{
                    counter++;
                    currentNode=currentNode.getNextNode();
                }
            }while(currentNode!=null);
        }
        return data;
    }
    
    public void remove(int i){
        int counter=0;
        Node currentNode=head;
        Node prevNode=null;
        if(currentNode == null){
            System.out.println("The list is empty");
        }else{
            while(currentNode!=null){
                if(counter==i){
                    if(currentNode==head){
                        if(currentNode.getNextNode()!=null){
                            head=currentNode.getNextNode();
                        }else{
                            head=null;
                        }
                    }else{
                        if( currentNode.getNextNode()!=null ){
                            prevNode.setNextNode(currentNode.getNextNode());    
                        }else{
                            prevNode.setNextNode(null);
                        }
                    }
                }else{
                    prevNode=currentNode;
                    currentNode=currentNode.getNextNode();
                }
                counter++;
            }
        }
        
        this.traverse();
    }
}

public class Main{
    public static void main(String[] args){
        int[] input = {10,21,13,4,501};
        MyLinkedList myLinkedList = new MyLinkedList();
        for(int i : input){
            myLinkedList.add(i);
        }
        
        myLinkedList.traverse();
        
        System.out.println("Going to remove");
        
        myLinkedList.remove(0);
        
        System.out.println("The value at position 5 is "+myLinkedList.get(3));
    }
}
