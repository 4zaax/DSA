public class Trie {

    Node root;

    Trie () {
        this.root = new Node();
    }

    Trie (char c) {
        this.root = new Node(c);
    }

    //** Search **//

    public boolean search (String key){
        Node current = this.root;
        for (char c : key.toCharArray()){
            c = Character.toLowerCase(c);
            int index = c - 'a';
            if (current.alph[index] != null){
                current = current.alph[index];
            } else {
                return false;
            }
        }
        return true;
    }    
    
    public boolean searchValid (String key){
        Node current = this.root;
        for (char c : key.toCharArray()){
            c = Character.toLowerCase(c);
            int index = c - 'a';
            if (current.alph[index] != null){
                current = current.alph[index];
            } else {
                return false;
            }
        }
        if (current.isValid == true) return true;
        else return false;
    }

    public void insert (String key){
        Node current = this.root;
        for (int i = 0; i < key.length(); i++){
            char c = key.charAt(i);
            c = Character.toLowerCase(c);
            int index = c - 'a';
            if (i == key.length()-1){
                if (current.alph[index] ==  null){
                    current.alph[index] = new Node(c);
                    current.alph[index].setValid();
                } else {
                    current.alph[index].setValid();
                }
            }
            if (current.alph[index] == null){
                current.alph[index] = new Node(c);
                current = current.alph[index];
            } else {
                current = current.alph[index];
            }
        }
    }

    public void allStrings() {
        StringBuilder currentString = new StringBuilder();
        allStringsHelper(this.root, currentString);
    }

    private void allStringsHelper(Node currentNode, StringBuilder currentString) {
        if (currentNode.isValid) {
            System.out.println(currentString.toString());
        }

        for (int i = 0; i < 26; i++) {
            if (currentNode.alph[i] != null) {
                currentString.append((char) (i + 'a'));
                allStringsHelper(currentNode.alph[i], currentString);
                currentString.deleteCharAt(currentString.length() - 1);
            }
        }
    }

    
    public boolean delete(String key) {
        return deleteHelper(root, key, 0);
    }

    private boolean deleteHelper(Node current, String key, int index) {
        if (index == key.length()) {
            if (!current.isValid) {
                System.out.println("there is no such a word.");
                return false;
            }
            current.unsetValid();
            return isNodeEmpty(current);
        }

        // Continue to the next character in the string.
        char c = key.charAt(index);
        int childIndex = c - 'a';
        Node childNode = current.alph[childIndex];

        if (childNode == null) {
            System.out.println("We dont have such a word.");
            return false;
        }

        boolean canDeleteCurrentNode = deleteHelper(childNode, key, index + 1);

        if (canDeleteCurrentNode) {
            current.alph[childIndex] = null;
            return !current.isValid && isNodeEmpty(current);
        }

        return false;
    }

    private boolean isNodeEmpty(Node node) {
        for (int i = 0; i < 26; i++) {
            if (node.alph[i] != null) {
                return false;
            }
        }
        return true;
    }

}