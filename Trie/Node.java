public class Node {
    Character ch;
    boolean isValid;
    Node[] alph;
    String sofar;

    Node() {
        this.ch = ' ';
        this.sofar = "";
        this.isValid = false;
        this.alph = new Node[26];
        for (int i = 0; i < 26; i++) {
            alph[i] = null;
        }
    }

    Node(char c) {
        this.ch = c;
        this.sofar = "";
        this.isValid = false;
        this.alph = new Node[26];
        for (int i = 0; i < 26; i++) {
            alph[i] = null;
        }
    }

    public void setValid() {
        this.isValid = true;
    }

    public void unsetValid() {
        this.isValid = false;
    }

    private int getCharIndex(char c) {
        c = Character.toLowerCase(c);
        return c - 'a';
    }
}