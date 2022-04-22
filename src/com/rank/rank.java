package com.rank;

public class rank implements Comparable<rank>{
    private String name;
    private title rankTitle;

    public rank(String name, title rankTitle){
        this.name = name;
        this.rankTitle = rankTitle;
    }

    @Override
    public int compareTo(rank rankOfOtherRank) {
        title thisRankTitle = this.getTitle();
        title thisOtherTitle = rankOfOtherRank.getTitle();

        int thisRank, otherRank;

        thisRank = getRank(thisRankTitle);
        otherRank = getRank(thisOtherTitle);

        if (thisRank > otherRank){
            return 1;
        } else if (otherRank > thisRank){
            return -1;
        } else if (thisRank == otherRank){
            return 0;
        } else if (thisRank < 0 || thisRank > 8){
            return 400; //ERROR: thisRank is outside range
        } else if (otherRank < 0 || otherRank > 8){
            return 401; //ERROR: otherRank is outside range
        } else {
            return 422;
        }
    }

    private title getTitle() {
        return this.rankTitle;
    }

    private int getRank(title thisRank) {
        if (thisRank == title.eaglePalm){
            return 8;
        } else if (thisRank == title.eagle) {
            return 7;
        } else if (thisRank == title.life) {
            return 6;
        } else if (thisRank == title.star) {
            return 5;
        } else if (thisRank == title.firstClass) {
            return 4;
        } else if (thisRank == title.secondClass) {
            return 3;
        } else if (thisRank == title.tenderfoot) {
            return 2;
        } else if (thisRank == title.scout) {
            return 1;
        } else {
            return 0;
        }
    }
}
