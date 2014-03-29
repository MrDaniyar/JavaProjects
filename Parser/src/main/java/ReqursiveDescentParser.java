public class ReqursiveDescentParser implements Parser{

    private enum Lexem {
        Number,
        Open,
        Close,
        Plus,
        Mult,
        End
    };

    /*
        where are we (at what lexem)
     */
    private Lexem lexem;
    /*
        this value
     */
    private int value;
    /*
        this position
     */
    private int position;
    /*
        our expression
     */
    private char[] expression;

    public ReqursiveDescentParser() {
        this.position = -1;
    }

    private void nextLexem() {
        if (position < expression.length-1) {
            position++;
            if (expression[position] == '(') {
                this.lexem = Lexem.Open;
            } else if (expression[position] == ')') {
                this.lexem = Lexem.Close;
            } else if (expression[position] == '*') {
                this.lexem = Lexem.Mult;
            } else if (expression[position] == '+') {
                this.lexem = Lexem.Plus;
            } else {
                this.lexem = Lexem.Number;
                this.value = this.expression[position] - '0';
            }
        } else {
            this.lexem = Lexem.End;
        }
    }

    private int expressionCalc() {
        int result;
        result = summand();

        while (this.lexem == lexem.Plus) {
            nextLexem();
            result += summand();
        }

        return result;
    }

    private int summand() {
        int summ;
        summ = mult();

        while (this.lexem == Lexem.Mult) {
            nextLexem();
            summ *= mult();
        }

        return summ;
    }

    private int mult() {
        switch (lexem) {
            case Number: {
                int buff = this.value;
                nextLexem();
                return buff;
            }
            case Open: {
                nextLexem();
                int buff = expressionCalc();
                nextLexem();
                return buff;
            }
        }

        return 0;
    }

    @Override
    public int parseAndCalculate(String expressions) {
        this.expression = expressions.toCharArray();
        int result = 0;
        nextLexem();
        result = expressionCalc();
        this.position = -1;
        return result;
    }
}
