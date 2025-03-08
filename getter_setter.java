public class getter_setter {
    public static void main(String args[]){
      Pen p1 = new Pen();
      p1.setColor("blue");
      System.out.println(p1.getColor());
      p1.setQty(5);
      System.out.println(p1.getQty());
      p1.setColor("Yellow");
      System.out.println(p1.getColor());
    }
}

  class Pen{
   private String color;
   private int qty;

    String getColor(){
        return this.color;
    }

    void setColor(String color){
    this.color = color;
      }

    int getQty(){
        return this.qty;
    }

    void setQty(int qty){
        this.qty = qty;
    }

  }
