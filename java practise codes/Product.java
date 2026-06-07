class Product {
    private int stock = 50;
    void addStock(int qty) {
        stock += qty;
    }
    void sellStock(int qty) {
        if (qty <= stock)
            stock -= qty;
        else
            System.out.println("Not Enough Stock");
    }
    void displayStock() {
        System.out.println("Stock = " + stock);
    }
    public static void main(String[] args) {
        Product p = new Product();
        p.addStock(20);
        p.sellStock(30);
        p.displayStock();
    }
}