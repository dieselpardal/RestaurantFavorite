public class Table {
    private String[] data;
    private int size;

    public Table(String [] datas) {
        data = datas;
        this.size = data.length;
    }

    public String get(int index) {
        return index<size? this.data[index] : null;
    }

    public String[] getAll() {
        return this.data;
    }

    public int length() {
        return this.size;
    }
}
