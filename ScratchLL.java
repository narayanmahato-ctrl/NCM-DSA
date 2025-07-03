import java.util.*;

public class ScratchLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

        


    }

    public void add1st(int data){
        // System.out.println("enter a number");
        // Scanner sc=new Scanner(System.in);
        // int data=sc.nextInt();

        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;

        }
        newnode.next=head;
        head=newnode;

        // sc.close();
    }

    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;

        }
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;

    }

    public void printll(){
        if(head==null){
            System.out.println("ll is empty");
        }
        Node currnode=head;
        while(currnode.next!=null){
            System.out.print(currnode.data+" -> ");
            currnode=currnode.next;

        }
        System.out.print("null");
    }

    public static void main(String[] args){
        ScratchLL list=new ScratchLL();
       String choice="y";
        int data =1;
         System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
         data=sc.nextInt();

        System.out.print("type y for continue");
        // System.out.println("enter a number");

        while(choice=="y"|| choice=="Y"){
            System.out.println("enter a number");
        // Scanner sc=new Scanner(System.in);
         data=sc.nextInt();
         
        // list.add1st(data);
        
        sc.close();

        }
        // System.out.println("enter a number");
        // Scanner sc=new Scanner(System.in);
        // int data=sc.nextInt();
        
        // list.add1st();
        //   list.add1st();
       
        // list.printll();
list.add1st(data);
        //   list.add1st();
       
        list.printll();
        sc.close();
       


    }
    
}
