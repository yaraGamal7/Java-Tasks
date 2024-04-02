class ThrowException extends Exception {
    public ThrowException(String message) {
        super(message);
    }
}

class TestException {
    int factorial(int num) throws ThrowException {
        if(num < 0) throw new ThrowException("there is error negative number");
        if(num == 1) return 1;
        return num * factorial(num - 1);
    }

    public void computeFactorial() {
        System.out.println("Calculating factorial...");
        try {
            System.out.println("Factorial of -5 = " + factorial(-5));
        } catch(ThrowException e) {
            e.printStackTrace();
        }
    }

    public void divide(int num) throws ThrowException {
        System.out.println("Calculating divide...");
        if(num == 0) throw new ThrowException("divided by zero");
        else {
            int result = 10 / num;
            System.out.println("Result of divide: " + result);
        }
    }

    //main
    public static void main(String[] args) {
        TestException t = new TestException();

        t.computeFactorial();

        int val = 0;
        try {
            t.divide(val);
        } catch(ThrowException e) {
            e.printStackTrace();
        }
    }
}
