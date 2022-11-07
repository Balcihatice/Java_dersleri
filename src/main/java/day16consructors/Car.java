package day16consructors;

public class Car {
    int price;
    int year; // kullanıcı 500 girince buraya geldi
    String make;
    String model;
    String color;
    boolean isDiesel;
    double km;  // kilometre:milage

    public Car(int price, int year, String make, boolean isDiesel) {      // filtre gibi seçtik
        this.price = price;  // rekler yukarısı ile aynı oldu.sol taraf instance variable'dır.sağ taraf parametredir.
        //                 5000 yazdım(constructorın içinden pass ile geldi),bu sola atandı.
        //                 this dediğimiz için bu deger yukarıdaki int price a atandı.
        this.year = year;
        this.make = make;
        this.isDiesel = isDiesel;
    }

    public Car(int price, int year, String make, boolean isDiesel, String model, String color,double km) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.isDiesel = isDiesel;
        this.model = model;
        this.color = color;
        this.km = km;
    }

    public static void main(String[] args) {

        Car car1 = new Car(5000, 2018, "Toyota", true);

        System.out.println(car1.price); // objeyi al nokta koy ve istediğin degere ulaş biz objenin price ına ulaştık
        System.out.println(car1.year); //2018
        System.out.println(car1.make); // Toyota
        System.out.println(car1.isDiesel); //true
        System.out.println("***********************");

        Car car2 = new Car(8000, 2020, "Audi", false);

        System.out.println(car2.price); // objeyi al nokta koy ve istediğin degere ulaş biz objenin price ına ulaştık
        System.out.println(car2.year); //2018
        System.out.println(car2.make); // Toyota
        System.out.println(car2.isDiesel); //true
        System.out.println("**********************");

        Car car3 = new Car(3000,2002,"BMW",false,"3.51i", "red",50000);

        System.out.println(car3.price);
        System.out.println(car3.year);
        System.out.println(car3.make);
        System.out.println(car3.isDiesel);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.km);




    }
}
