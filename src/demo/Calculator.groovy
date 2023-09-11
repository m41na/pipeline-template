package demo

class Calculator implements ICalculator{

    @Override
    int add(int left, int right) {
        return left + right
    }

    @Override
    int subtract(int left, int right) {
        return left - right
    }

    @Override
    int multiply(int left, int right) {
        return left * right
    }

    @Override
    int divide(int left, int right) {
        return left / right
    }
}
