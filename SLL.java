class SLL extends Node{
    public Node head;
    public SLL(){
        this.head = null;
    }
    public SLL(int val){
        this.head = new Node(val);
    }
    public void add(int val){
        if(this.head == null){
            this.head = new Node(val);
        }
        else{
            Node runner = this.head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = new Node(val);
        }
    }
    public void remove(){
        Node runner = this.head;
        if(runner.next == null){
            this.head = null;
        }else{
            while(runner.next.next != null){
                runner = runner.next;
            }
            runner.next = null;
        }
    }
    public void printValues(){
        Node runner = this.head;
        while(runner!=null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    public Node find(int val){
        Node runner = this.head;
        if(runner.value == val)
            return runner;
        else{
            while(runner.next!=null){
                runner = runner.next;
                if(runner.value == val){
                    return runner;
                }
            }
            return new Node();
        }
    }
}