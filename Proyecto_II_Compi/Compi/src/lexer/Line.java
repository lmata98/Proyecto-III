/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

/**
 *
 * @author geovanny
 */
public class Line {
    private int numLine;
    private int occurrences;

    public Line(int numLine) {
        this.numLine = numLine;
        this.occurrences = 1;
    }

    @Override
    public String toString() {
        if (occurrences > 1) {
            return numLine + "(" + occurrences + ')';
        }
        return "" + numLine;
    }

    
    /**
     * @return the numLine
     */
    public int getNumLine() {
        return numLine;
    }

    /**
     * @param numLine the numLine to set
     */
    public void setNumLine(int numLine) {
        this.numLine = numLine;
    }

    /**
     * @return the occurrences
     */
    public int getOccurrences() {
        return occurrences;
    }

    /**
     * @param occurrences the occurrences to set
     */
    public void setOccurrences(int occurrences) {
        this.occurrences = occurrences;
    }
    
    
}
