package textAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    /*NegativeTextAnalyzer должен конструироваться конструктором по-умолчанию*/
    private String[] keywords = { ":(", "=(", ":|" };
    private Label label;

    public NegativeTextAnalyzer() {
        label = Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
