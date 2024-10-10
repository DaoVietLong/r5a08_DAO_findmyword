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
        else {
            for (int i = 0; i < this.word.length(); i++) {
                if (this.word.charAt(i) == myStr.charAt(index)) {
                    point = Letter.PART_CORRECT;
                }
            }
        }
        e
    }
}
