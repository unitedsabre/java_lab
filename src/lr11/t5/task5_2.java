package lr11.t5;

class create {
    public int value;
    public create next;
    create(int value, create next) {
        this.value = value;
        this.next = next;
    }
}
class task5_2 {
    public static void main(String[] args) {
        create head = new create(0, null);
        create tail = head;

        for (int i = 0; i < 9; i++) {
            tail.next = new create(i + 1, null);
            tail = tail.next;
        }

        create ref = head;

        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}