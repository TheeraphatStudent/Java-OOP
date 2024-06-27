package Encaosulate;

public class Encapsulate {
    private String prop;
    private String word;
    public int number;

    // Constructor
    Encapsulate(
            String prop,
            String word,
            int number) {
        this.setProp(prop);
        this.setWord(word);
        this.setNumber(number);

    }

    // getter method restive value
    public String getProp() {
        return prop;

    }

    public String getWord() {
        return word;

    }

    public int getNumber() {
        return number;

    }

    public Object[] getAll() {
        Object[] content = new Object[] { getProp(), getWord(), getNumber() };
    
        return content;
    }

    // Set value
    public void setProp(String getProp) {
        this.prop = getProp;

    }

    public void setWord(String getWord) {
        this.word = getWord;

    }

    public void setNumber(int getNumber) {
        this.number = getNumber;

    }

    
}
