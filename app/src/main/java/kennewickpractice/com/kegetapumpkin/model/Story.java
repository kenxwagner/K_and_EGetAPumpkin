package kennewickpractice.com.kegetapumpkin.model;

import kennewickpractice.com.kegetapumpkin.R;

/**
 * Created by ken.wagner on 11/5/2015.
 */
public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[7]; //based on how many pages made

        mPages[0] = new Page();
        mPages[0].setImageId(R.mipmap.kandeinsidetoon);
        mPages[0].setText("temp ipsem lorem");
        mPages[0].setChoice1(new Choice());
        mPages[0].setChoice2(new Choice());
        //more to fix and more to do and finish




    }


}
