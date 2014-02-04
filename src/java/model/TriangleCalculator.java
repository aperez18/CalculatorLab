package model;

public class TriangleCalculator implements CalculatorStrategy{

    private final String A = "sideA";
    private final String B = "sideB";

    private double sideA;
    private double sideB;
    
    @Override
    public double getAnswer() {
        return Math.sqrt( (sideA*sideA) + (sideB*sideB) );
    }

    @Override
    public void setAttribute(String param, double value) {
        if(param == null || param.isEmpty()){
            throw new IllegalArgumentException();
        }else if(param.equals(A)){
            sideA = value;
        }else if(param.equals(B)){
            sideB = value;
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getAttribute(String param) {
        if(param == null || param.isEmpty()){
            throw new IllegalArgumentException();
        }else if(param.equals(A)){
            return sideA;
        }else if(param.equals(B)){
            return sideB;
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String getShape() {
        return "Triangle";
    }
    
}
