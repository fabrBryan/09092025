public class Instruments {
    //property/atribut/variabel
    private String name;
    private double price;

    //Default Constructor
    public Instruments() {
        name = "Piano";
        price = 320;
    }

    //Getter
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    //Setter
    public void setName(String n) {
        name = n;
    }
    public void setPrice(double pr){
        price = pr;
    }

    //Constructor Parameter
    public Instruments(String n, double pr){
        name = n;
        price = pr;
    }
    public void display (){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
