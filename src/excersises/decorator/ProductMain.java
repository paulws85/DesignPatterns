package excersises.decorator;

public class ProductMain {

    public static void main(String[] args) {
        Product tv = new TvSuper(new TvMidle(new TV()));
        tv.subscribe();
        System.out.println(tv.description());
        Product internet = new InternetHigh(new InternetLow(new Internet()));
        internet.subscribe();
        System.out.println(internet.description());
        Product phone = new PhoneHigh(new PhoneLow(new Phone()));
        phone.subscribe();
        System.out.println(phone.description());

        ClientService clientProduct = new ClientService();
        clientProduct.addToList(tv);
        clientProduct.addToList(internet);
        clientProduct.addToList(phone);

        for(Product product: clientProduct.getProducts()) {
            product.description();
        }

    }
}
