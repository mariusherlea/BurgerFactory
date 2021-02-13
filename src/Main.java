
class Hamburger {
    private String name, breadRoll, meat;
    private int  lettuce, tomato, carrot, lettucePrice = 2, tomatoPrice = 3, carrotPrice = 4, totalPrice = 0;

    public Hamburger(String name, String breadRoll, String meat, int lettuce, int tomato, int carrot, int totalPrice) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;

        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.totalPrice = totalPrice;

        System.out.println("pret initial = " + totalPrice);
        additions(lettucePrice, lettuce);
        additions(tomatoPrice, tomato);
        additions(carrotPrice, carrot);

        System.out.println("_totalPrice = " + getTotalPrice());
    }

    public void additions(int elementPrice, int elementQuantity) {
        if (elementQuantity > 0) {
            this.totalPrice += elementQuantity * elementPrice;
            System.out.println("_totalPrice = " + this.totalPrice + " adding " + elementQuantity + " element at the price of " + elementPrice + " each");
        }
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}

class HealthyBurger extends Hamburger {
    private int avocado, lemon, avocadoPrice = 10, lemonPrice = 5;

    public HealthyBurger(String name, String breadRoll, String meat, int lettuce, int tomato, int carrot, int totalPrice, int avocado) {
        super(name, breadRoll, meat, lettuce, tomato, carrot, totalPrice);



        System.out.println("Avem total price = " + getTotalPrice());
        additions(avocadoPrice, avocado);
        additions(lemonPrice, lemon);
        System.out.println("total = " + getTotalPrice());
    }
}

class DeluxeHamburger extends HealthyBurger {
    private int chipsAndDrinkPrice = 20;


    public DeluxeHamburger(String name, String breadRoll, String meat, int lettuce, int tomato, int carrot, int totalPrice, int avocado, int chipsAndDrink) {
        super(name, breadRoll, meat, lettuce, tomato, carrot, totalPrice, avocado);

        additions(chipsAndDrinkPrice, chipsAndDrink);
    }
}


public class Main {
    public static void main(String[] args) {
//        Hamburger h1 = new Hamburger("h1", "integrala", "pork", 100, 1, 0, 1);
//        HealthyBurger h2 = new HealthyBurger("h2", "integrala", "pork", 1, 1, 0, 100,1);
        DeluxeHamburger dh = new DeluxeHamburger("dh", "integrala", "vita", 1, 4, 1, 500, 7, 1);

    }
}
