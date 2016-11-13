
public class ListElement {

	private String value;
	private ListElement next;
	private ListElement prev;

	public ListElement(String thema) {

		this.value = thema;
		this.next = null;
		this.prev = null;

	}

	public ListElement(String thema, ListElement next, ListElement prev) {

		this.value = thema;
		this.next = next;
		this.prev = prev;

	}

	public String getThema() {

		return value;

	}

	public void setThema(String s) {

		this.value = s;

	}

	public ListElement getNext() {

		return next;

	}

	public void setNext(ListElement next) {
		this.next = next;

	}

	public ListElement getPrev() {

		return prev;
	}

	public void setPrev(ListElement prev) {

		this.prev = prev;

	}
}
