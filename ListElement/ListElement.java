package LisElement;


public class ListElement {


	public ListElement next;

	private int data;

	

	

	public ListElement()

	{

		this.next = null;

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

	

	public void addElement(ListElement le) {

		

	le.next = this;

		

	}

	

	public ListElement getElement(int index){

		 

		

		ListElement p = new ListElement();

		p = this;

		

		for(int i=0 ; i< index ; i++) {

			p = p.next;

		}

		return p;

	}

	

	

	public ListElement deleteElement(int index) {

		 

		ListElement p = new ListElement();

			p = this;

			

			for(int i=0 ; i< index ; i++) {

				p = p.next;

			}

			p = p.next.next;

			

			return p;

		 

	}

	 

	public void printLinkedListHead() {

		ListElement p = new ListElement();

			p = this;

			

			do {

				int that = p.data;

				System.out.print(that);

				System.out.print("->");

				p = p.next;

			}while(p.next != null);

			int that = p.data;

			System.out.print(that);

			

	}

}