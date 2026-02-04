/**
 * Calculadora que resuelve expresiones en notacion postfix
 */
public class Calculadora implements Calc {
    
    private Stack<Integer> pila; //pila para guardar los operandos

/**
 * Constructor de la calculadora.
 *
 * @param pila Pila que se usará para hacer los cálculos.
 */
    public Calculadora(Stack<Integer> pila) {
        this.pila = pila;
    }

/**
 * Evalúa una expresión en notación postfix y devuelve el resultado.
 *
 * Precondición:
 * - La expresión debe estar escrita en notación postfix.
 * - Los números y operadores deben estar separados por espacios.
 *
 * Postcondición:
 * - Se devuelve el resultado de la expresión.
 * - La pila queda vacía al terminar el cálculo.
 *
 * @param input Expresión postfix que se quiere evaluar.
 * @return Resultado de la expresión.
 */

    public int Operate(String input) {

        String[] partes = input.split(" "); // se separa la expresion por espacios

        for (int i = 0; i < partes.length; i++) { //se recorre la expresion

            String actual = partes[i];

            // si es un operando
            if (actual.equals("0") || actual.equals("1") || actual.equals("2") ||
                actual.equals("3") || actual.equals("4") || actual.equals("5") ||
                actual.equals("6") || actual.equals("7") || actual.equals("8") ||
                actual.equals("9")) {

                pila.push(Integer.parseInt(actual));
            }
            // si es operador
            else {
                int b = pila.pop();
                int a = pila.pop();

                if (actual.equals("+")) {
                    pila.push(a + b);
                }
                if (actual.equals("-")) {
                    pila.push(a - b);
                }
                if (actual.equals("*")) {
                    pila.push(a * b);
                }
                if (actual.equals("/")) {
                    pila.push(a / b);
                }
            }
        }

        return pila.pop();
    }
}
