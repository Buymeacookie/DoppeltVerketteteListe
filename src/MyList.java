
public class MyList {

	private ListElement first;
	private ListElement last;

	public MyList() {

		first = null;
		last = null;

	}
	
	public void addFirst(String thema) {
		
		last = first;
		first = new ListElement(thema, first);
		
		
	}
}
