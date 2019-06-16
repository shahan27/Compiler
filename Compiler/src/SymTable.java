public final class SymTable {
    static class Scope {
        Symbol[] symbolTable = new Symbol[HASH_TABLE_SIZE];
        Scope next = null;
    }

    private static final int HASH_TABLE_SIZE = 211;
    private static Scope headerScope = new Scope();

    public static void insert(Symbol symbol) {
        int hashValue = hash(symbol.getName());

        Symbol bucketCursor = headerScope.symbolTable[hashValue];
        if (bucketCursor == null) {

            headerScope.symbolTable[hashValue] = symbol;
        } else {

            while (bucketCursor.next != null) {
                bucketCursor = bucketCursor.next;
            }
            bucketCursor.next = symbol;
        }
    }

    public static Symbol lookup(String symbolName) {
        int hashValue = hash(symbolName);
        Symbol bucketCursor = headerScope.symbolTable[hashValue];
        Scope scopeCursor = headerScope;

        while (scopeCursor != null) {
            while (bucketCursor != null) {
                if (bucketCursor.getName().equals(symbolName)) {
                    return bucketCursor;
                }
                bucketCursor = bucketCursor.next;
            }
            scopeCursor = scopeCursor.next;
        }
        return null;
    }

    public static int hash(String symbolName) {
        int h = 0;
        for (int i = 0; i < symbolName.length(); i++) {
            h = h + h + symbolName.charAt(i);
        }

        h = h % HASH_TABLE_SIZE;

        return h;
    }

    public static void openScope() {
        Scope innerScope = new Scope();
        innerScope.next = headerScope;
        headerScope = innerScope;
    }

    public static void closeScope() {
        headerScope = headerScope.next;
    }

    public static Scope getHeaderScope() {
        return headerScope;
    }
}