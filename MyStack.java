import java.util.NoSuchElementException;


public class MyStack implements IStack {
	Object[] list = new Object[100];
   int size = 0;
   int front;
   
	@Override
	public void push(Object item) {
   list[size] = item;
    int front = size;
   size++;
	}

	@Override
	public Object pop() {
     if (isEmpty() != true){
     Object temp = list[size-1];
     front = size-2;
     size--;
     return temp;
     } else {throw new NoSuchElementException();}
	}

	@Override
	public Object peek() {
      
      if (isEmpty() != true){
      return list[size-1];
     } else {throw new NoSuchElementException();}
	}
	

	@Override
	public int indexOf(Object item) {
   
   
   int location = -1;
  int realoc = 0;
      
      for (int i = size-1; i >= 0; i--){
        
         if ( list[i] == item) {
             location = size - (i+1);
            
         } 
        
      }
     
     
      
      return location;
	}

	@Override
	public int size() {
      return size;
	}

	@Override
	public boolean isEmpty() {
      if (size > 0){
         return false;
         
      } else { return true;}
	}

}
