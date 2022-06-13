package ArtGallery;

public class Arts {
    int price; // in $
    int stock;
    int width; // in cm
    int length; // in cm
    String name;
    String artistName;
    String kind;

    public Arts(int price, int stock, int width, int length, String name, String artistName, String kind){
        this.price = price;
        this.stock = stock;
        this.width = width;
        this.length = length;
        this.name = name;
        this.artistName = artistName;
        this.kind = kind;
    }

    public void getArtsInfo(){
        System.out.println("piece name: " + name);
        System.out.println("piece size: " + width*length);
        System.out.println("piece price: " + "$" + price);
        System.out.println("piece kind" + kind);
        System.out.println("Copyrights reserved by : " + artistName);
    }

    public boolean isInStock() {
        if (stock <= 0) {
            return false;
        }
        return true;
    }

}

