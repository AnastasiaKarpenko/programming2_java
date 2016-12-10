
public class Change {
    private char fromChar;
    private char toChar;
    
    public Change(char fromCharacter, char toCharacter) {
        fromChar = fromCharacter;
        toChar = toCharacter;
    }
    
    public String change(String characterString) {
        String changedString = characterString.replace(fromChar, toChar);
        return changedString;
    }
    
}
