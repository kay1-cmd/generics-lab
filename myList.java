import java.util.ArrayList;

public class myList <T extends Number>{
	
	private ArrayList<T> arrayList;
	
	public myList(ArrayList<T> a) {
		
		arrayList = a;
	}
	
	public void add(T x){
		
		arrayList.add(x);
	}
	
	public T largest() {
		
		T val = arrayList.get(0);
		
		for(int i = 0; i < arrayList.size(); i++) {
			
			if(  arrayList.get(i).floatValue() > val.floatValue() )
				val = arrayList.get(i);
			
		}
		
		return val;
	}
	
	public T smallest() {
		
		T val = arrayList.get(0);
		
		for(int i = 0; i < arrayList.size(); i++) {
			
			if(  arrayList.get(i).floatValue() < val.floatValue() )
				val = arrayList.get(i);
			
		}
		
		return val;
	}


}
