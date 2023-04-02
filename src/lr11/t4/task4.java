package lr11.t4;

class primer {
    public int value;
    public primer next;
    primer(int value, primer next) {
        this.value = value;
        this.next = next;
    }}
class task4 {
    public static void main(String[] args) {
        primer node0 = new primer(0, null);
        primer node1 = new primer(1, null);
        primer node2 = new primer(2, null);
        primer node3 = new primer(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        primer ref = node0;

        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}