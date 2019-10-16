public class ThreeDimensionalShape extends Shape {
   private double dimension1;
   private double dimension2;
   private double dimension3;
   
   ThreeDimensionalShape(String color, boolean filled, double dimension1, double dimension2, double dimension3){
      super(color, filled);
      this.dimension1 = dimension1;
      this.dimension2 = dimension2;// add 2 more
   }// end constructor
   
   public double getDimension1(){
      return dimension1;
   }// end getter
   
   public void setDimension1(double dimension1){
      this.dimension1 = dimension1;
   }// end setter
   
   public double getDimension2(){
      return dimension2;
   }// end getter
   
   public void setDimension2(double dimension2){
      this.dimension2 = dimension2;
   }// end setter
   
   public double getDimension3(){
      return dimension3;
   }// end getter
   
   public void setDimension3(double dimension3){
      this.dimension3 = dimension3;
   }// end setter
   
   public String toString() {
      return "created on: " + /*dateCreated +*/ "\n" + 
      "color: " + getColor() + "\n" + "filled: " + getFilled() +
      "shape type: 3-D" + "\n" + "dimension1: " + getDimension1() + "\n" +
      "dimension2: " + getDimension2() + "\n";
   }// end of method

}// end of class