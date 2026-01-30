class Encap9 {
    private int x;

    public void set(int a) {
        x = a;
    }

    public int get() {
        return x;
    }

    public static void main(String[] args) {
        Encap9 e = new Encap9();
        e.set(10);
        System.out.println(e.get());
    }
}
