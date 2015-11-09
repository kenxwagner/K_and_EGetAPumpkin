package kennewickpractice.com.kegetapumpkin.model;

import kennewickpractice.com.kegetapumpkin.R;

/**
 * Created by ken.wagner on 11/5/2015.
 */
public class Story {
    private Page[] mPages;

    public Story(){
        mPages = new Page[11];

        mPages[0] = new Page(
                R.mipmap.page0,
                "%1$s, K and E would like to get a pumpkin, can you help them? Should they ask to go to the Coffee Shop or go to the Pumpkin Patch?",
                new Choice("Go to the Coffee Shop", 1),
                new Choice("Go to the Pumpkin Patch",  2),
                new Choice(null,3));

        mPages[1]=new Page(
                R.mipmap.page1,
                "You have arrived at the Coffee Shop, the parents of K and E get coffee. K and E get hot chocolate, and so do you,  %1$s!  Finish your drink and we will go to the Pumpkin Patch.",
                new Choice("Go to the Pumpkin Patch",  1),
                new Choice("null",  2),
                new Choice(null,  3));

        mPages[2]=new Page(
                R.mipmap.page2,
                "Welcome to the Pumpkin Patch! You can either look for pumpkins after the Corn Maze or you can ride the Tractor to the pumpkins.",
                new Choice("Go to the Corn Maze",  1),
                new Choice("Go on the Tractor Ride",  2),
                new Choice(null,  3));

        mPages[3]=new Page(
                R.mipmap.page3,
                "You are in the Corn Maze, but it is much bigger than K and E thought it would be. What should we do?",
                new Choice("Go Back to the Pumpkin Patch",  1),
                new Choice("Finish the Corn Maze",  2),
                new Choice(null,  3));

        mPages[4]=new Page(
                R.mipmap.page4,
                "You are riding the tractor and it stops three times. Which one would you like to take?",
                new Choice("Get off at the First Stop",  1),
                new Choice("Get off at the Second Stop",  2),
                new Choice("Get off at the Third Stop",  3));

        mPages[5]=new Page(
                R.mipmap.page5,
                "You found  a Giant Pumpkin! Sorry, it is too big for anyone to pick it up. Try a different area.",
                new Choice("Go Back to the Tractor Ride",  1),
                new Choice("Take the Left Path",  2),
                new Choice("Take the Right Path",  3));

        mPages[6]=new Page(
                R.mipmap.page6,
                "Ugh! What is that smell? You brought K and E to where the pumpkin patch owners left rotten pumpkins out. These are not the right pumpkins.",
                new Choice("Go Back to the Tractor Ride",  1),
                new Choice("Take the Left Path",  2),
                new Choice("Take the Right Path",  3));


        mPages[7]=new Page(
                R.mipmap.page7,
                "K and E are happy! You found the Right Pumpkin!",
                new Choice("Buy it",  1),
                new Choice("Go Back to the Tractor Ride",  2),
                new Choice(null,  3));

        mPages[8]=new Page(
                R.mipmap.page8,
                "K and E hand over the pumpkin so that their parents can buy it. They are happy you came along. ",
                new Choice("next page",  1),
                new Choice("null",  2),
                new Choice(null,  3));

        mPages[9]=new Page(
                R.mipmap.page9,
                "Thanks your you help %1$s, K and E would like to thank you.",
                new Choice("The last page",  1),
                new Choice("null",  2),
                new Choice(null,  3));

        mPages[10]=new Page(
                R.mipmap.page10,
                "Happy Halloween",
                new Choice("Close",  1),
                new Choice("null",  2),
                new Choice(null,  3));
    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}

