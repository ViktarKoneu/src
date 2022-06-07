package FiboFacto;

public class Logik {
    static int[] logikSide(int algorithmId, int loopType, int n) {
        FibonacciMethod1 fibo1 = new FibonacciMethod1();
        FibonacciMethod2 fibo2 = new FibonacciMethod2();
        FibonacciMethod3 fibo3 = new FibonacciMethod3();
        FactoryMethod1 fact1 = new FactoryMethod1();
        FactoryMethod2 fact2 = new FactoryMethod2();
        FactoryMethod3 fact3 = new FactoryMethod3();
        int[] dimm = new int[n];
        switch (algorithmId) {
            case 1:
                switch (loopType) {
                    case 1:
                        int[] res1 = fibo1.fibonacci1(n);
                        dimm = res1;
                        break;
                    case 2:
                        int[] res2 = fibo2.fibonacci2(n);
                        dimm = res2;
                        break;
                    case 3:
                        int[] res3 = fibo3.fibonacci3(n);
                        dimm = res3;
                        break;
                }
                break;
            case 2:
                switch (loopType) {
                    case 1:
                        int[] res1 = fact1.factory1(n);
                        dimm = res1;
                        break;
                    case 2:
                        int[] res2 = fact2.factory2(n);
                        dimm = res2;
                        break;
                    case 3:
                        int[] res3 = fact3.factory3(n);
                        dimm = res3;
                        break;
                }
                break;
            default:
                System.out.println("failure error");
        }
        return dimm;
    }

}
