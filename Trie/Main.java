public class Main {
    public static void main (String[] args){
        Trie T = new Trie();
        T.insert("wing");
        T.insert("win");
        T.insert("so");
        T.insert("some");
        T.insert("see");
        T.insert("tip");
        T.insert("this");
        T.insert("thin");
        T.insert("then");
        T.insert("the");
        boolean res = T.search("th");
        System.out.println(res);
        T.allStrings();
    }

}