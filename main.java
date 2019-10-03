import LisElement.ListElement;


public class main {


	public static void main(String[] args){

		

		ListElement  le = new ListElement();

		le.setData(5);

		

		ListElement  le2 = new ListElement();

		le2.setData(4);

		

		le.addElement(le2);

		

		ListElement  le3 = new ListElement();

		le3.setData(3);

		

		le2.addElement(le3);

		

		

		ListElement  le4 = new ListElement();

		le4.setData(2);

		

		le3.addElement(le4);

		

		//ListElement its = 	le4.getElement(3);

		//int it = its.getData();

		//System.out.println(it);

		le4.printLinkedListHead();

	}

}