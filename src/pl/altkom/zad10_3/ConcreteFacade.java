package pl.altkom.zad10_3;

public class ConcreteFacade implements Facade {
    private OrderService orderService;
    private InvoiceService invoiceService;

    public ConcreteFacade() {
        invoiceService = new InvoiceService();
        orderService = new OrderService();
    }

    @Override
    public Invoice makeAnOrder(Order o) {
        System.out.println("Należność: " + orderService.calculateOrder(o));
        return invoiceService.createInvoice(o);
    }
}
