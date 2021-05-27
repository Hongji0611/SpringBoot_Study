package hello.hellospring.service;

import hello.hellospring.CalulationResult;
import hello.hellospring.OperandRequest;

public class CalculateServiece {
    public CalulationResult add(OperandRequest input) {
        CalulationResult result = new CalulationResult(input.getOperandFirst() + input.getOperandSecond());
        return result;
    }
    public CalulationResult sub(OperandRequest input) {
        CalulationResult result = new CalulationResult(input.getOperandFirst() - input.getOperandSecond());
        return result;
    }
    public CalulationResult mul(OperandRequest input) {
        CalulationResult result = new CalulationResult(input.getOperandFirst() * input.getOperandSecond());
        return result;}
    public CalulationResult division(OperandRequest input) {
        CalulationResult result = new CalulationResult(input.getOperandFirst() / input.getOperandSecond());
        return result;
    }
}
