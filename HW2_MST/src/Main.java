public class Main {
    public static void main(String[] args) {
        try {
            // Providing a clearly invalid certification number
            SalesPerson sp1 = new SalesPerson("John Doe", 30, 35000, "invalid-cert-num");  // This should trigger the exception
            System.out.println(sp1);
        } catch (InvalidEmployeeCertException e) {
            System.out.println("Caught InvalidEmployeeCertException: " + e.getMessage());
        } catch (InvalidEmployeeSalaryException e) {
            System.out.println("Caught InvalidEmployeeSalaryException: " + e.getMessage());
        }
    }
}


// test cases for the code