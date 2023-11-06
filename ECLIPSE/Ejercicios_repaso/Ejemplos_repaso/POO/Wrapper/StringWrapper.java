package Wrapper;

public class StringWrapper {
	
    private String wrappedString;

    public StringWrapper(String str) {
        this.wrappedString = str;
    }

    public int length() {
        return wrappedString.length();
    }

    public StringWrapper toUpperCase() {
        return new StringWrapper(wrappedString.toUpperCase());
    }

    public StringWrapper toLowerCase() {
        return new StringWrapper(wrappedString.toLowerCase());
    }

    public boolean contains(String substring) {
        return wrappedString.contains(substring);
    }

    // Otros métodos adicionales que puedas necesitar

    @Override
    public String toString() {
        return wrappedString;
    }
}
