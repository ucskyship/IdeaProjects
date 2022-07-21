package exercise;

public class CitizenTaxCal {

    String acctNo;
    int startBalance;
    int creditTotalItemCharges;
    int totalOfCreditApplied;
    int allowedCredit;

    public void setAccountDetails(String accountNo, int startBalance, int totalCharges, int totalCredit, int creditLimit) {
        setAcctNo(accountNo);
        setStartBalance(startBalance);
        setCreditTotalItemCharges(totalCharges);
        setTotalOfCreditApplied(totalCredit);
        setAllowedCredit(creditLimit);
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public int getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }

    public int getCreditTotalItemCharges() {
        return creditTotalItemCharges;
    }

    public void setCreditTotalItemCharges(int creditTotalItemCharges) {
        this.creditTotalItemCharges = creditTotalItemCharges;
    }

    public int getTotalOfCreditApplied() {
        return totalOfCreditApplied;
    }

    public void setTotalOfCreditApplied(int totalOfCreditApplied) {
        this.totalOfCreditApplied = totalOfCreditApplied;
    }

    public int getAllowedCredit() {
        return allowedCredit;
    }

    public void setAllowedCredit(int allowedCredit) {
        this.allowedCredit = allowedCredit;
    }

    public int getNewBalance() {
        return getStartBalance() - getCreditTotalItemCharges() +  getTotalOfCreditApplied();
    }

    public boolean creditExceeded() {
        return getNewBalance() <= getAllowedCredit();
    }
}
