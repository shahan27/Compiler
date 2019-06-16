//Shahan Rahman CS City College
public class Symbol {
    private String name = "";
    private String tokenType = "";
    private Parser.TYPE dataType = null;
    private int address;
    private int returnAddress;

    private Object low;
    private Object high;

    private Parser.TYPE indexType;
    private Parser.TYPE valueType;

    Symbol next;

    public Symbol(String name, String tokenType, Parser.TYPE dataType, int address){
        this.name = name;
        this.tokenType = tokenType;
        this.dataType = dataType;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parser.TYPE getDataType() {
        return dataType;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public int getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(int returnAddress) {
        this.returnAddress = returnAddress;
    }

    public Object getLow() {
        return low;
    }

    public void setLow(Object low) {
        this.low = low;
    }

    public Object getHigh() {
        return high;
    }

    public void setHigh(Object high) {
        this.high = high;
    }

    public Parser.TYPE getIndexType() {
        return indexType;
    }

    public void setIndexType(Parser.TYPE indexType) {
        this.indexType = indexType;
    }

    public Parser.TYPE getValueType() {
        return valueType;
    }

    public void setValueType(Parser.TYPE valueType) {
        this.valueType = valueType;
    }
}
