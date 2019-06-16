//Shahan Rahman CS City College

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public final class Emulator {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Token> tokenArrayList = TokenScanner.scan(new File(args[0]));
        Parser.setTokenArrayListIterator(tokenArrayList);
        Byte[] instructions = Parser.parse();
        Simulator.setInstructions(instructions);
        Simulator.simulate();
    }
}