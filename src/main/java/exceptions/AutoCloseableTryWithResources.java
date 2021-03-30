package exceptions;

public class AutoCloseableTryWithResources {

    private void orderOfClosingResources() throws Exception {
        try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
             AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

            af.doSomething();
            as.doSomething();
        }
    }

    public static void main(String[] args) throws Exception {
        AutoCloseableTryWithResources tryWithResources = new AutoCloseableTryWithResources();
        tryWithResources.orderOfClosingResources();
    }
}
