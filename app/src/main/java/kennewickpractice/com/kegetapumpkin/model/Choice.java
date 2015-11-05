package kennewickpractice.com.kegetapumpkin.model;

/**
 * Created by ken.wagner on 11/5/2015.
 */
public class Choice {
    private String mText;
    private int mNext;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNext() {
        return mNext;
    }

    public void setNext(int next) {
        mNext = next;
    }
}
