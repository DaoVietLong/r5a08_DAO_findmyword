package r5a08_findmyword;

public class Score {

    private String word;
    private Letter point = Letter.INCORRECT;

    public Score(String word) {
        this.word = word;
    }

    public Letter letter(int character) {
        return point;
    }

    public void assess(int index, String myStr) {
        if (this.word.charAt(index) == myStr.charAt(index)){
            point = Letter.CORRECT;
        }
    }
}
