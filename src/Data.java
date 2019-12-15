class Data {

    private int[] data;
    private int count;
    private int max;

    public Data(int size) {
        data = new int[size];
        count = 0;
        max = size;
    }

    public void add(int data) {
        if (count<max)
            this.data[count++] = data;
    }

    public void set(int index, int data) {
            this.data[index] = data;
    }

    public int get(int index) {
        return index<max ? this.data[index] : null;
    }

    public int[] getAll() {
        return this.data;
    }
}
