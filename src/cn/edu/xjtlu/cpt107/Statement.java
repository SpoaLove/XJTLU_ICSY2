package cn.edu.xjtlu.cpt107;

import static java.lang.String.format;
import static org.apache.commons.lang.StringUtils.center;

public class Statement {
    private final String statement;
    private final Boolean value;
    public String statement() {
        return statement;
    }
    public Boolean isTrue() {
        return value;
    }

    public static final char NOT     = '~';
    public static final char AND     = '∧';
    public static final char OR      = '∨';
    public static final char IMPLIES = '→';

    public Statement(String statement, boolean value) {
        this.statement = statement;
        this.value = value;
    }

    public Statement negate() {
        return unaryStatementOperation(NOT);
    }
    public Statement or(Statement another) {
        return binaryStatementOperation(another,OR);
    }
    public Statement and(Statement another) {
        return binaryStatementOperation(another,AND);
    }
    public Statement implies(Statement another) {
        return binaryStatementOperation(another,IMPLIES);
    }

    private Statement unaryStatementOperation(char operation) {
        if (operation == NOT) {
            return new Statement("~ ( "+ statement +" )",!this.value);
        }
        return null;
    }

    private Statement binaryStatementOperation(Statement another, char operation) throws IllegalStateException {
        String newStatement = " " + statement + " " + operation + " " + another.statement + " ";
        boolean newValue = switch (operation) {
            case AND     -> value && another.value;
            case OR      -> value || another.value;
            case IMPLIES -> (!value) || another.value;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
        return new Statement(newStatement,newValue);
    }

    public Statement rename(String statement) {
        return new Statement(statement, value);
    }

    public void print() {
        System.out.println(statement + " : " + value);
    }

    public static final String P_FORMAT               = "| p ";
    public static final String Q_FORMAT               = "| q ";
    public static final String NOT_P_FORMAT           = "| ~ p ";
    public static final String NOT_Q_FORMAT           = "| ~ q ";
    public static final String P_AND_Q_FORMAT         = "| p ∧ q ";
    public static final String P_OR_Q_FORMAT          = "| p ∨ q ";
    public static final String P_IMPLIES_Q_FORMAT     = "| p → q ";
    public static final String GENERIC_FORMAT         = "| %s ";
    public static final String GENERIC_NOT_FORMAT     = "| ~ %s ";
    public static final String GENERIC_AND_FORMAT     = "| %s ∧ %s ";
    public static final String GENERIC_OR_FORMAT      = "| %s ∨ %s ";
    public static final String GENERIC_IMPLIES_FORMAT = "| %s → %s ";
    public static final String GENERIC_STATEMENT      = "| %s %s %s ";
    public static final String NEW_LINE               = "|\n";
    public static final String BAR                    = "|";



    public void negationTable() {
        String formattedP = format(GENERIC_FORMAT,statement);
        String formattedOpP = format(GENERIC_NOT_FORMAT,statement);
        String title = formattedP
                .concat(formattedOpP)
                .concat(NEW_LINE);
        String line   = "*" + "-".repeat(title.length()-3) + "*\n";
        String table  = format(GENERIC_FORMAT, center(this.toString(), formattedP.length()-3))
                .concat(format(GENERIC_FORMAT, center(this.negate().toString(), formattedOpP.length()-3)))
                .concat(NEW_LINE);
        System.out.print(line+title+line+table+line);
    }

    public void binaryOPTable(char operation, Statement other) {
        Statement pOpQ      = this.binaryStatementOperation(other, operation);
        String formattedP   = format(GENERIC_FORMAT,statement);
        String formattedQ   = format(GENERIC_FORMAT,other.statement);
        String formattedOp  = format(GENERIC_FORMAT, pOpQ.statement);
        String title = formattedP + formattedQ + formattedOp + NEW_LINE;
        String line   = "*" + "-".repeat(title.length()-3) + "*\n";
        String table  = format(GENERIC_FORMAT, center(this.toString(), formattedP.length()-3))
                .concat(format(GENERIC_FORMAT, center(other.toString(), formattedQ.length()-3)))
                .concat(format(GENERIC_FORMAT, center(pOpQ.toString(), formattedOp.length()-3)))
                .concat(NEW_LINE);
        System.out.print(line+title+line+table+line);
    }


    public void testLogicTable(Statement other) {
        String p = statement;
        String q = other.statement;
        String titles = format(GENERIC_FORMAT,p)
                .concat(format(GENERIC_FORMAT,q))
                .concat(format(GENERIC_NOT_FORMAT,p))
                .concat(format(GENERIC_NOT_FORMAT,q))
                .concat(format(GENERIC_FORMAT,this.or(other).negate().statement()))
                .concat(NEW_LINE);
        String line   = "*" + "-".repeat(titles.length()-3) + "*\n";
        String logics = format(GENERIC_FORMAT.repeat(5).concat(NEW_LINE),
                center(this.toString(),this.statement.length()),
                center(other.toString(), other.statement.length()),
                center(this.negate().toString(),this.negate().statement.length()-4),
                center(other.negate().toString(), other.negate().statement.length()-4),
                center(this.or(other).negate().toString(),this.or(other).negate().statement.length())
        );
        System.out.print(line+titles+line+logics+line);

    }

    @Override
    public String toString() {
        return value ? "T" : "F";
    }

    public static void main(String[] args) {
        Statement p = new Statement("p",true);
        Statement q = new Statement("q",false);
        p.testLogicTable(q);
        p.negationTable();
        p.negate().binaryOPTable(AND,q);
    }
}