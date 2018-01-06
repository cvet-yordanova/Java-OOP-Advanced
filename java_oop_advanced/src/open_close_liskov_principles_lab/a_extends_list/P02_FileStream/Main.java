package open_close_liskov_principles_lab.a_extends_list.P02_FileStream;


public class Main {
    public static void main(String[] args) {
        File f = new File(10, 20);
        Music m = new Music(5, 2);
        StreamProgressInfo a = new StreamProgressInfo(f);
        StreamProgressInfo b = new StreamProgressInfo(m);

        System.out.println(a.calculateCurrentPercent());
        System.out.println(b.calculateCurrentPercent());
    }
}
