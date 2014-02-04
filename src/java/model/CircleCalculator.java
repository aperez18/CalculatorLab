package model;

public class CircleCalculator implements CalculatorStrategy{

    private final String RADIUS = "radius";
    private double r;
    
    @Override
    public double getAnswer() {
        return Math.PI*(r*r);
    }

    @Override
    public void setAttribute(String param, double value) {
        if(param == null || param.isEmpty()){
            throw new IllegalArgumentException();
        }else if(param.equals(RADIUS)){
            r = value;
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getAttribute(String param) {
        if(param == null || param.isEmpty()){
            throw new IllegalArgumentException();
        }else if(param.equals(RADIUS)){
            return r;
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String getShape() {
        return "Circle";
    }
    
}
