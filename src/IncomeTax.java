public class IncomeTax {
    private final double income;
    private final int status;
    public IncomeTax(double income, int status) {
        this.income = income;
        this.status = status;
    }
    public double getTax() {
        double tax1 = 0;
        double tax2 = 0;
        if (status == Constant.SINGLE) {
            if (income <= Constant.RATE1_SINGLE_LIMIT) {
                tax1 = Constant.RATE1 * income;
            } else {
                tax1 = Constant.RATE1 * Constant.RATE1_SINGLE_LIMIT;
                tax2 = Constant.RATE2 * (income - Constant.RATE1_SINGLE_LIMIT);
            }
        } else {
            if (income <= Constant.RATE1_MARRIED_LIMIT) {
                tax1 = Constant.RATE1 * income;
            } else {
                tax1 = Constant.RATE1 * Constant.RATE1_MARRIED_LIMIT;
                tax2 = Constant.RATE2 * (income - Constant.RATE1_MARRIED_LIMIT);
            }
        }
        return tax1 + tax2;
    }

}