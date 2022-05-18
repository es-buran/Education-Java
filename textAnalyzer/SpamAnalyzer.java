package textAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer {
    /*SpamAnalyzer должен конструироваться от массива строк
     с ключевыми словами. Объект этого класса должен сохранять
     в своем состоянии этот массив строк в приватном поле keywords*/
    private String[] keywords;
    private Label label;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords.clone();
        this.label = Label.SPAM;
    }


    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return this.label;
    }
}
