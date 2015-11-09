package kennewickpractice.com.kegetapumpkin.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import kennewickpractice.com.kegetapumpkin.R;
import kennewickpractice.com.kegetapumpkin.model.Page;
import kennewickpractice.com.kegetapumpkin.model.Story;

public class StoryActivity extends AppCompatActivity {


    public static final String TAG = StoryActivity.class.getSimpleName();

    private Story mStory = new Story();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;
    private String mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        mName = intent.getStringExtra(getString(R.string.title_name));

        if (mName == null) {
            mName = "Friend";
        }
        Log.d(TAG,mName);

        mImageView = (ImageView)findViewById(R.id.storyImageView);
        mTextView = (TextView)findViewById(R.id.storyTextView);
        mChoice1 = (Button)findViewById(R.id.choiceButton1);
        mChoice2 = (Button)findViewById(R.id.choiceButton2);
        mChoice3 = (Button)findViewById(R.id.choiceButton3);

        loadPage();
    }
    private void loadPage() {
        Page page = mStory.getPage(0);

        Drawable drawable = ContextCompat.getDrawable(this, page.getImageId());
        mImageView.setImageDrawable(drawable);

        String pageText = page.getText();
        // Add user name if placeholder is included. Not added if placeholder is not there.
        pageText = String.format(pageText, mName);
        mTextView.setText(pageText);

        mChoice1.setText(page.getChoice1().getText());
        mChoice2.setText(page.getChoice2().getText());
        mChoice3.setText(page.getChoice3().getText());

    }

}
