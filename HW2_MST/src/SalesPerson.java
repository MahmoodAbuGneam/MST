


public class SalesPerson extends Employee implements Comparable<SalesPerson> {
    private String certificationNumber;

    public SalesPerson(String name, int age, double salary, String certNum) throws InvalidEmployeeSalaryException, InvalidEmployeeCertException {
        super(name, age, salary);
        if (!certNum.matches("\\d{3}-\\w{3}")) {
            throw new InvalidEmployeeCertException("Invalid Certification Number: " + certNum);
        }
        this.certificationNumber = certNum;
    }


    private boolean isValidCertificationNumber(String certNumber){
        return certNumber.matches("\\d{3}-\\w{3}");
    }

    @Override
    public int compareTo(SalesPerson other) {
        if (this.getSalary() > other.getSalary()) {
            return 1; // this salesperson has more sal
        } else if (this.getSalary() < other.getSalary()) {
            return -1; // this salesperson has less sal
        } else {
            return 0; // same sal
        }
    }

}
