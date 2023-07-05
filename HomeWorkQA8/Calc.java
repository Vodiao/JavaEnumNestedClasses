enum Calc {
    SUM{
        @Override
        public double action(double a, double b) {
            return a + b;
        }
    },
    SUBTRACTION{
        @Override
        public double action(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICATION{
        @Override
        public double action(double a, double b) {
            return a * b;
        }
    },
    DIVISION{
        @Override
        public double action(double a, double b) {
             if(b != 0){
                 double result = a / b;
                 return result;
             }else {
                 System.out.println("Cannot divide by zero.");
             }
             return 0;

        }
    },
    EDUCATIONINDEGREE{
        @Override
        public double action(double a, double b) {
            return Math.pow(a,b);
        }
    };

    public abstract double action (double a, double b);
}
