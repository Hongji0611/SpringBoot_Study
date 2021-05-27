package hello.hellospring;

public class OperandRequest {
    int operandFirst;
    int operandSecond;

    public OperandRequest(int operandFirst, int operandSecond) {
        this.operandFirst = operandFirst;
        this.operandSecond = operandSecond;
    }

    public int getOperandFirst() {
        return operandFirst;
    }

    public void setOperandFirst(int operandFirst) {
        this.operandFirst = operandFirst;
    }

    public int getOperandSecond() {
        return operandSecond;
    }

    public void setOperandSecond(int operandSecond) {
        this.operandSecond = operandSecond;
    }
}
