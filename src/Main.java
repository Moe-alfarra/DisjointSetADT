public class Main {

    public static void main(String[] args) {

        DisjointSet set = new DisjointSet();

        System.out.println(set.toString());
        for (int i = 0; i < 10; i++) {
            set.makeSet(i);
        }

        System.out.println(set.toString());
        set.union(4, 5);
        System.out.println(set.find(4));
        System.out.println(set.find(5));
        set.union(0, 2);
        System.out.println(set.find(2));
        set.union(0, 4);
        System.out.println(set.find(5));

        System.out.println(set.toString());
    }
}
