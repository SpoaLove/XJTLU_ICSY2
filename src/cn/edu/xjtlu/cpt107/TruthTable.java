package cn.edu.xjtlu.cpt107;

public class TruthTable {

    private int[][] truthTable;
    private int     variables;
    private int     rows;

    public TruthTable(int[][] truthTable) {
        this.truthTable = truthTable;
        this.rows = truthTable.length;
        this.variables = truthTable[0].length;
        //System.out.printf("rows:%d\tvariables:%d",rows,variables);
    }

    public TruthTable(int n) {
        this(makeTruthTable(n));
    }

    public TruthTable() {
        this(2);
    }

    private static int[][] makeTruthTable(int n) {
        char startChar = 'p';
        for (int i = 0; i < n; i++) {
            System.out.print(startChar++ + "\t");
        }
        System.out.println();
        int rows = (int) Math.pow(2,n);
        int[][] truthTable = new int[rows][n];
        for (int i=0; i<rows; i++) {
            for (int j=n-1; j>=0; j--) {
                truthTable[i][j] = (i/(int) Math.pow(2, j))%2;
                System.out.print(truthTable[i][j] + "\t");
            }
            System.out.println();
        }
        return truthTable;
    }

    public static void printNotTable() {
        //∧∨~→
    }

    public static void printOrTable(){

    }

    public static void printAndTable(){

    }

    public static void main(String[] args) {
        TruthTable table = new TruthTable();
    }

    private boolean toBoolean(int n) {
        return n == 1;
    }


}
