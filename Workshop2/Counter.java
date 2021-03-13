
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

	public void count(int input){
		value += input;
	}

	public int getValue(){
		return value;
	}

	public void reset(){
		value = 0;
	}
}