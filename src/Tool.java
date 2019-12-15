public class Tool {

    public void show(Object text) {
        System.out.println(text);
    }

    public String subline(int size){
        return "-".repeat(size);
    }

    public String tab(String text, int size) {
        if(size<=0) size=1;
        return String.format("%-"+size+"s",text);
    }

}
