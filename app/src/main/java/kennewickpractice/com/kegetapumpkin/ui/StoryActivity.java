package kennewickpractice.com.kegetapumpkin.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import kennewickpractice.com.kegetapumpkin.R;
import kennewickpractice.com.kegetapumpkin.model.Choice;
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
    private Page mCurrentPage;

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

        loadPage(0);
    }
    private void loadPage(int choice) {
        mCurrentPage = mStory.getPage(choice);

        Drawable drawable = ContextCompat.getDrawable(this, mCurrentPage.getImageId());
        mImageView.setImageDrawable(drawable);

        String pageText = mCurrentPage.getText();
        // Add user name if placeholder is included. Not added if placeholder is not there.
        pageText = String.format(pageText, mName);
        mTextView.setText(pageText);

        if (mCurrentPage.isFinal()){

            mChoice1.setVisibility(View.GONE);
            mChoice2.setVisibility(View.GONE);
            mChoice3.setText("PLAY AGAIN");
            mChoice3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        else {
            // and if to take care of empty text
            mChoice1.setText(mCurrentPage.getChoice1().getText());
            mChoice2.setText(mCurrentPage.getChoice2().getText());
            mChoice3.setText(mCurrentPage.getChoice3().getText());




            mChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice1().getNextPage();
                    loadPage(nextPage);
                }

            });

            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice2().getNextPage();
                    loadPage(nextPage);
                }
            });

            mChoice3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice3().getNextPage();
                    loadPage(nextPage);
                }
            });
        }
    }

}
