package  doubleLinkedList;


public class  doubleLinkedList{


	public  doubleLinkedList next;

	private  doubleLinkedList previous ;

	private int data;

	

	

	public  doubleLinkedList()

	{

		this.next = null;

		this.previous = null;

		this.data = 0;

		

	}

	

	

	public void setData(int data)

	{

		this.data = data;

	}


	

	public int getData()

	{

		return this.data;

	}

	

	public void addElement(doubleLinkedList le) {

		

	le.next = this;

	this.previous = le;	

	}

	

	public doubleLinkedList getElement(int index){

		 

		

		doubleLinkedList p = new doubleLinkedList();

		p = this;

		

		for(int i=0 ; i< index ; i++) {

			p = p.next;

		}

		return p;

	}

	

	

	public doubleLinkedList deleteElement(int index) {

		 

		doubleLinkedList p = new doubleLinkedList();

			p = this;

			

			for(int i=0 ; i< index -1 ; i++) {

				p = p.next;

			}

			if(p.next.next != null)

			{

			p.next = p.next.next;

			p.next.previous = p;

			}else {

				p.next = null;

			}

			return p;

		 

	}

	 

	public void printLinkedListHead() {

		doubleLinkedList p = new doubleLinkedList();

			p = this;

			

			do {

				int that = p.data;

				System.out.print(that);

				System.out.print("->");

				p = p.next;

			}while(p.next != null);

			int that = p.data;

			System.out.println(that);

			

	}

	 

	public void printLinkedListTail() {

		doubleLinkedList p = new doubleLinkedList();

			p = this;

			

			while(p.next != null)

			{

				p = p.next;

			}

			

			do {

				int that = p.data;

				System.out.print(that);

				System.out.print("->");

				p = p.previous;

			}while(p.previous != null);

			

			

			int that = p.data;

			System.out.println(that);

			

	}

}