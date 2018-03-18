package Assign_5_Aug_11_2014;

interface Media {

    void genre(String a);

    void title(String a);

    void duration(int a);

    void yor(String a);

    void publisher(String a);
}

class Albums {

}

abstract class Podcasts {

    abstract void freq(String s);
}

class Audiobooks implements Media {

    @Override
    public void genre(String g) {
    }

    @Override
    public void title(String g) {
        System.out.println(g);
    }

    @Override
    public void duration(int g) {
        System.out.println("dur :" + g);
    }

    @Override
    public void yor(String g) {
    }

    @Override
    public void publisher(String g) {
    }

}

class Songs extends Albums implements Media {

    String artist;
    int tracks;

    @Override
    public void genre(String g) {
        System.out.println(g);
    }

    @Override
    public void publisher(String g) {
        System.out.println(g);
    }

    @Override
    public void duration(int g) {
        System.out.println("min : " + g);
    }

    @Override
    public void yor(String g) {
        System.out.println(g);
    }

    @Override
    public void title(String g) {
        System.out.println(g);
    }

    Songs(String a, int t) {
        artist = a;
        tracks = t;
    }

    void getdata() {
        System.out.println("artist : " + artist);
        System.out.println("tracks : " + tracks);

    }

}

class Epis extends Podcasts implements Media {

    String author;

    Epis(String a) {
        author = a;
    }

    void getdata() {
        System.out.println("author : " + author);
    }

    @Override
    void freq(String f) {
        System.out.println(f);
    }

    @Override
    public void genre(String g) {
        System.out.println(g);
    }

    @Override
    public void title(String g) {
        System.out.println(g);
    }

    @Override
    public void duration(int g) {
        System.out.println("int : " + g);
    }

    @Override
    public void yor(String g) {
    }

    @Override
    public void publisher(String g) {
    }
}

public class Assign_5_Q4 {

    public static void main(String args[]) {
        Songs s = new Songs("Atif Aslam", 5);
        Audiobooks b = new Audiobooks();
        Epis e = new Epis("Steven Frayne");
        
        s.genre("Sufi");
        s.title("Tu Jaane Na");
        s.yor("2009");
        s.publisher("T-Series");
        s.duration(4);
        s.getdata();
        System.out.println();
        
        b.title("Feynman Lectures on Physics");
        b.duration(58);
        b.publisher("Tata McGraw Hills");
        b.yor("1971");
        System.out.println();

        e.freq("Daily");
        e.genre("Comedy");
        e.title("The Big Bang Theory");
        e.duration(22);
        e.getdata();
    }
}
