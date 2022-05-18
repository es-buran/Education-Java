package textAnalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {
    /*TooLongTextAnalyzer должен конструироваться от int'а с максимальной
     допустимой длиной комментария. Объект этого класса должен сохранять
     в своем состоянии это число в приватном поле maxLength*/
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) return Label.TOO_LONG;
        else return Label.OK;
    }
}