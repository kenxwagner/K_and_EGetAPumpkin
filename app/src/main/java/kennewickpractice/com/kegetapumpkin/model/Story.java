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
                new Choice("Go to the Coffee Shop",  1),
                new Choice("Go to the Pumpkin Patch",  2)
                );


        mPages[1]=new Page(
                R.mipmap.page1,
                "You are at the Coffee Shop, the parents of K and E get coffee. K and E get hot chocolate, and so do you,  %1$s!  Finish your drink and we will go to the Pumpkin Patch.",
                new Choice("Go to the Pumpkin Patch",  2),
                new Choice("Stay at the Coffee Shop", 1));


        mPages[2]=new Page(
                R.mipmap.page2,
                "Welcome to the Pumpkin Patch Farm! You can either look for pumpkins after the corn maze or you can ride the tractor to the pumpkins.",
                new Choice("Go to the corn maze",  3),
                new Choice("Go on the tractor ride",  4)
                );


        mPages[3]=new Page(
                R.mipmap.page3,
                "You are in the corn maze, but it is much bigger than K and E thought it would be. You can go back or finish the Corn Maze. What should we do?",
                new Choice("Go back to the pumpkin patch",  2),
                new Choice("Finish the corn maze",  6)
                );


        mPages[4]=new Page(
                R.mipmap.page4,
                "You are riding the tractor and it stops two times. Which one would you like to take?",
                new Choice("Get off at the first stop",  5),
                new Choice("Get off at the second stop",  7)
        );


        mPages[5]=new Page(
                R.mipmap.page5,
                "You found  a giant pumpkin! Sorry, it is too big for anyone to pick it up. You can wait for the tractor or take the path. Try a different area.",
                new Choice("Go back to the tractor ride",  4),
                new Choice("Take the path",  6)
        );


        mPages[6]=new Page(
                R.mipmap.page6,
                "Ugh! What is that smell? You brought K and E to where someone left rotten pumpkins. Will you follow the sign to the tractor ride or continue on the path?.",
                new Choice("Walk to the tractor stop",  4),
                new Choice("Continue on the path",  7));


        mPages[7]=new Page(
                R.mipmap.page7,
                "K and E are happy! You found the right pumpkin, %1$s!",
                new Choice("Buy it",  8),
                new Choice("Go back to the tractor ride",  4));


        mPages[8]=new Page(
                R.mipmap.page8,
                "K and E hand over the pumpkin so that their parents can buy it. They are happy you came along. ",
                new Choice("Continue",  9),
                new Choice("Back to the giant pumpkin", 5));


        mPages[9]=new Page(
                R.mipmap.page9,
                "Thanks your you help %1$s, K and E would like to thank you.",
                new Choice("The last page",  10),
                new Choice("Coffee time", 1));


        mPages[10]=new Page(
                R.mipmap.page10,
                "Happy Halloween");

    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}

