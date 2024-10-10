package r5a08_findmyword;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Score guess(String myStr) {
        Score score = new Score(word);

        /* Calcule le score pour la lettre d'indice 0 de la tentative*/
        score.assess(0, myStr);

        return score;
    }
}
