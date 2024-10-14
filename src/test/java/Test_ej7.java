import org.example.genericos.Operable;

public class Test_ej7 {
    public static void main(String[] args) {
        Operable<Integer> operacion = new Operable<Integer>() {

            @Override
            public Integer add(Integer element) {
                return element + 1;
            }

            @Override
            public Integer substract(Integer element) {
                return element - 1;
            }

            @Override
            public Integer multiply(Integer element) {
                return element * 2;
            }

            @Override
            public Integer divide(Integer element) {
                return element / 2;
            }
        };

        System.out.println("Suma: " + operacion.add(5) + ", resta; " + operacion.substract(5) + ", multiplicacion " + operacion.multiply(5) + ", division " + operacion.divide(5));

    }
}
