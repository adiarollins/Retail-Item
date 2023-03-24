public class Retail {
  public static void main(String[] args) {
    RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
    RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
    RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
    System.out.println("Item1\n======\n" + item1 + "\n");
    System.out.println("Item2\n======\n" + item2 + "\n");
    System.out.println("Item3\n======\n" + item3 + "\n");
  }
}