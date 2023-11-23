public class Main {
    /**
     * Task1
     */
    private static class Calculator {
        private static <N extends Number> Number sum (N x, N y){
            return x.doubleValue() + y.doubleValue();
        }
        private static <N extends Number> Number subtract(N x, N y){
            return x.doubleValue() - y.doubleValue();
        }
        private static <N extends Number> Number multiply (N x, N y){
            return x.doubleValue() * y.doubleValue();
        }
        private static <N extends Number> Number divide(N x, N y){
            if (y.doubleValue() == 0){
                throw new ArithmeticException("You can't divide by zero");
            }
            return x.doubleValue() / y.doubleValue();
        }
    }
    /**
     * Task2
     */
    private static <T1, T2> boolean compareArrays(T1[] arr1, T2[] arr2){
        if (arr1.length != arr2.length) return false;
        return (checkArrayClass(arr1) & checkArrayClass(arr2));
    }
    private static <T> boolean checkArrayClass(T[] checkArr){
        if(checkArr.length < 2) return true;
        for (int i = 1; i < checkArr.length; i++) {
            if(!checkArr[0].getClass().getSimpleName().equals(checkArr[i].getClass().getSimpleName())) return false;
        }
        return true;
    }

    /**
     * Task3
     */
    private static class Pair<K, V> {
        private K key;
        private V value;
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getFirst() {
            return key;
        }
        public V getSecond() {
            return value;
        }
        @Override
        public String toString() {
            return "First = " + key +
                    ", Second = " + value;
        }
    }

    public static void main(String[] args) {
        /**
         * Task1
         */
        System.out.println(Calculator.sum(11, -1.0f));
        System.out.println(Calculator.subtract(12.5f, 7.5));
        System.out.println(Calculator.divide(16.5, 5.5));
        System.out.println(Calculator.divide(16.5, 5));
        System.out.println(Calculator.multiply(3, 5));
//        System.out.println(Calculator.divide(5, 0));
        System.out.println();
        /**
         * Task2
         */
        Integer[] arr1 = new Integer[] {1, 2, 3, 4 ,5};
        Double[] arr2 = new Double[] {1.1, 2.3, 3.7, 4.8, 5.0};
        String[] arr3 = new String[] {"One", "Two", "Three"};
        String[] arr4 = new String[] {"First", "Second", "Third", "Fourth", "Fifth"};
        Number[] arr5 = new Number[] {1, 2, 3.5, 4, 5};
        System.out.println(compareArrays(arr1, arr2));
        System.out.println(compareArrays(arr2, arr3));
        System.out.println(compareArrays(arr1, arr4));
        System.out.println(compareArrays(arr1, arr5));
        System.out.println();
        /**
         * Task3
         */
        Pair<Integer, String> pair = new Pair<>(1, "Second");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }

}