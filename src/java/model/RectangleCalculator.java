package model;

public class RectangleCalculator implements CalculatorStrategy{
    private final String LENGTH = "length";
    private final String WIDTH = "width";
    
    private double area;
    private double length;
    private double width;
    
//    public RectangleCalculator(double length, double width) throws IllegalArgumentException {
//        if(length > 0 && width > 0){
//            this.length = length;
//            this.width = width;
//        }else{
//            throw new IllegalArgumentException();
//        }
//    }
    
    private void calculateArea(){
        area = length*width;
    }
    
    public double getAnswer(){
        calculateArea();
        return area;
    }

    @Override
    public void setAttribute(String param, double value) throws IllegalArgumentException {
        if(param == null || param.isEmpty()){
            throw new IllegalArgumentException();
        }else if(param.equals(LENGTH)){
            length = value;
        }else if(param.equals(WIDTH)){
            width = value;
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getAttribute(String param) throws IllegalArgumentException {
        if(param == null || param.isEmpty()){
            throw new IllegalArgumentException();
        }else if(param.equals(LENGTH)){
            return length;
        }else if(param.equals(WIDTH)){
            return width;
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }
}
