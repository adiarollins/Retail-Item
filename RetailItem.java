//RetailItem Class 
public class RetailItem {
  private String description;
  private int unitsOnHand;
  private double price;


  public RetailItem(String description, int unitsOnHand, double price){
    this.description = description;
    this.unitsOnHand = unitsOnHand;
    this.price = price;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDescription(int unitsOnHand) {
    this.unitsOnHand = unitsOnHand;
  }

  public void setDescription(double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public int getUnitsOnHand() {
    return unitsOnHand;
  }

  public double getPrice() {
    return price;
  }

  public String toString() {
    return "Description: " + description + "\nUnits On Hand: " + unitsOnHand + "\nPrice: " + price;
  }
}