import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String InvoiceName = scanner.nextLine();
        double InvoiceAmountProduct1 = scanner.nextDouble();
        double InvoiceAmountProduct2 = scanner.nextDouble();
        double InvoiceTax = .19;
        double InvoiceTotal = (InvoiceAmountProduct1 + InvoiceAmountProduct2) * (1 + InvoiceTax);

        System.out.println("Invoice for: " + InvoiceName +
                "\n Product1: $" + InvoiceAmountProduct1 +
                "\n Product2: $" + InvoiceAmountProduct2 +
                "\n Tax: $" + (InvoiceAmountProduct1 + InvoiceAmountProduct2) * InvoiceTax +
                "\n Total: $" + InvoiceTotal);

        scanner.close();
    }
}
