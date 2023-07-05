public class Constructors {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.slices = 8;
    }
    
}

class Pizza {
    int slices;
    String topping;
    Pizza() {}
    Pizza (int pieces){
        slices = pieces;
    }
    public void eat() {
        slices = slices -1;
    }
}
