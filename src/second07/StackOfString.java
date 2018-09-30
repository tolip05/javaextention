package second07;

import java.util.ArrayList;

public class StackOfString {
    private ArrayList<String>data;

    public StackOfString(ArrayList<String> data) {
        this.data = data;
    }
    public void push(String item){
      this.data.add(item);
    }
    public String pop(){
      return this.data.remove(this.data.size() - 1);
    }
    public String peek(){
        return this.data.get(this.data.size() - 1);
    }
    public boolean isEmpty(String item){
     return this.data.isEmpty();
    }
}
