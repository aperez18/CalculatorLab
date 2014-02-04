package model;

public interface CalculatorStrategy {
    public abstract double getAnswer();
    public abstract void setAttribute(String param, double value);
    public abstract double getAttribute(String param);
    public abstract String getShape();
}
