class SLLTest extends SLL{
    public static void main(String[] args){
        SLL sll1 = new SLL(4);
        sll1.add(3);
        sll1.add(7);
        sll1.printValues();
        sll1.remove();
        sll1.printValues();
        Node myval = sll1.find(2);
        System.out.println(myval.value);
    }
}