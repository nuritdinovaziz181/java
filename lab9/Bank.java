class Bank {
    static double interestRate = 0.1;

    static double calculate(double amount) {
        return amount + amount * interestRate;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1000));
    }


}
