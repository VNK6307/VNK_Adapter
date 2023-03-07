public class IntsCalculator implements Ints {
    protected final Calculator target;
    int sum, mult, pow;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        sum = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return sum;
    }

    @Override
    public int mult(int arg0, int arg1) {
        mult = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return mult;
    }

    @Override
    public int pow(int a, int b) {
        pow = (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return pow;
    }
}