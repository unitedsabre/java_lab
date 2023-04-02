package lr11.t5;

class node {
    public int value;
    public node next;
    node(int value, node next) {
        this.value = value;
        this.next = next;
    }
}
class task5_1 {
    public static void main(String[] args) {
        node node0 = new node(0, null);
        node tail = node0;
        for (int i = 0; i < 9; i++) {
            tail.next = new node(i + 1, null);
            tail = tail.next;
        }
        node ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}