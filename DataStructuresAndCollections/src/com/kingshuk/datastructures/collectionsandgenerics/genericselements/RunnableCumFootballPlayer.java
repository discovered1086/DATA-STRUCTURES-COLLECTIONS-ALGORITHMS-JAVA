package com.kingshuk.datastructures.collectionsandgenerics.genericselements;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.FootballPlayer;

/** A class created to inherit two completely different types
 * for practicing generics
 * Created by CO21321 on 2/8/2018.
 */
public class RunnableCumFootballPlayer extends FootballPlayer implements Runnable, Comparable<RunnableCumFootballPlayer>{

    @Override
    public void run() {
        System.out.println("Just printing something inside ManagerCumFootballPlayer");
    }

    @Override
    public int compareTo(RunnableCumFootballPlayer o) {
        return 0;
    }
}
