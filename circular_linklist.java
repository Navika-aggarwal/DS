package practice;

public class circularlinkedlist {
	class node
	{
		
int data;
node next;
node(int data)
{
	this.data=data;
	
}
	} 
	public node head=null;
	public node tail=null;
	public void addatastart(int data)
	{
		node new_node=new node(data);
		if(head==null)
		{
			new_node.next=head;
			head=new_node;
			tail=new_node;
}
		else
		{
			
			node temp=head;
			new_node.next=temp;
			head=new_node;
			tail.next=head;
		}
	}
	public void display()
	{
		node current=head;
		if(head==null)
		{
			System.out.println("list is emty");
		}
		else
		{
			System.out.println("adding nodes to the start of the list");
	do
	{
		System.out.println(" "+current.data);
		current=current.next;
	}
	while(current!=head);
	System.out.println();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circularlinkedlist c=new circularlinkedlist();
		c.addatastart(1);
		c.display();
		c.addatastart(3);
		c.addatastart(2);
		c.display();
		c.addatastart(4);
		c.display();

	}

}
