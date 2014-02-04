package model;

public class CalculatorService {
    private double answer;
    private CalculatorStrategy calc;
    
    public CalculatorService(String shape){
        
        switch(shape){
            case "rectangle": calc = new RectangleCalculator(); break;
            case "triangle": calc = new TriangleCalculator(); break;
            case "circle": calc = new CircleCalculator(); break;
        }
    }
    
    public double getAnswer(){
        return calc.getAnswer();
    }
    
    public void setAttribute(String property, double value){
        calc.setAttribute(property, value);
    }
    
    public double getAttribute(String property){
        return calc.getAttribute(property);
    }
}
