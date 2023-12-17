public class DisjointSet {

    private int size;
    private int[] list;

    public DisjointSet() {
        size = 10;
        list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = -2;
        }
    }
    public DisjointSet(int s) {
        size = s;
        list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = -2;
        }
    }

    public void makeSet(int x) {
        list[x] = -1;
    }

    public int find(int x) {
        if (list[x] == -1) {
            return x;
        }
        else {
            return find(list[x]);
        }
    }

    public void union(int x, int y) {
        list[y] = x;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s+= list[i] + " ";
        }
        return "[" + s + "]";
    }
}
