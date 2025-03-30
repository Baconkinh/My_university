class Holder<N> { 
    private N value; 
    public N getValue() { 
    return value; 
    } 
    public void setValue(N v) { 
    this.value = v; 
    } 
    } 
    class Main2 { 
    public static void main(String... args) { 
    Holder<Integer> holder = new Holder<>(); 
    holder.setValue(256); 
    Holder<Character> holder1 = new Holder<>(); 
    holder1.setValue('A'); 

    // correct the line to make the code compile 
    Integer value =  holder.getValue();  //casting
    Character value1 = holder1.getValue();
    // do not change 
    System.out.println(value); 
    System.out.println(value1); 
    } 
    }