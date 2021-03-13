
public class Counter{
	private int initial;
	private int value;

	public Counter(){
		this(0);
	}

	public Counter(int initial){
		this.value = 0;
		this.initial = initial;
	}

<<<<<<< HEAD:Workshop2/Counter.java
	public void count(int input){
		value += input;
=======
	public void count(){
		value += initial;
>>>>>>> 53707f6363e40f11ee68cbaccca859234b13d02a:temp-ws2/Counter.java
	}

	public int getValue(){
		return value;
	}

	public void reset(){
		value = 0;
	}
}