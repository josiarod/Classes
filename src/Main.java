public class Main {
    public static void main(String[] args) {
        Burrito b = new Burrito();
        b.setBean("Black Beans");
        b.setMeat("Chicken");
        b.setRice("White Rice");

        System.out.println(b.getBean());
        System.out.println(b.getMeat());
        System.out.println(b.getRice());
        Veggies v = new Veggies();
        v.setFajitas(false);
        v.setLettuce(true);
        b.setVeggies(v);
        System.out.println("Fajitas is" + b.getVeggies().isFajitas());
        System.out.println("Fajis is " +b.getVeggies().isLettuce());
    }
}
