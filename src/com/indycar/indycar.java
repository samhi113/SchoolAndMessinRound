package com.indycar;

public class indycar {
    public int currentYear = 2022;
    private int carNumber, age, wins, poles, titles, indyWins, yearLastWin, yearLastTitle, yearLastIndyWin;
    private String driverName, teamName, engine;

    public indycar(String driverName, String teamName, int carNumber, String engine, int age, int wins, int poles, int titles, int indyWins, int yearLastWin, int yearLastTitle, int yearLastIndyWin){
        this.driverName = driverName;
        this.teamName = teamName;
        this.carNumber = carNumber;
        this.engine = engine;
        this.age = age;
        this.wins = wins;
        this.poles = poles;
        this.titles = titles;
        this.indyWins = indyWins;
        this.yearLastWin = yearLastWin;
        this.yearLastTitle = yearLastTitle;
        this.yearLastIndyWin = yearLastIndyWin;
    }

    public String getDriverName(){
        return this.driverName;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public String getEngine() {
        return engine;
    }

    public int getAge() {
        return age;
    }

    public int getWins() {
        return wins;
    }

    public int getPoles() {
        return poles;
    }

    public int getTitles() {
        return titles;
    }

    public int getIndyWins() {
        return indyWins;
    }

    public int getYearLastWin() {
        return yearLastWin;
    }

    public int getYearLastTitle() {
        return yearLastTitle;
    }

    public int getYearLastIndyWin() {
        return yearLastIndyWin;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setIndyWins(int indyWins) {
        this.indyWins = indyWins;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setPoles(int poles) {
        this.poles = poles;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setYearLastIndyWin(int yearLastIndyWin) {
        this.yearLastIndyWin = yearLastIndyWin;
    }

    public void setYearLastTitle(int yearLastTitle) {
        this.yearLastTitle = yearLastTitle;
    }

    public void setYearLastWin(int yearLastWin) {
        this.yearLastWin = yearLastWin;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String toString () {
        String finishedProduct = "Driver: " + this.driverName +
                "\nTeam: " + this.teamName +
                "\nCar #: " + this.carNumber +
                "\nAge: " + this.age +
                "\nEngine: " + this.engine +
                "\nWins: " + this.wins +
                "\nPoles: " + this.poles +
                "\nTitles: " + this.titles +
                "\nIndy 500 Wins: " + this.indyWins;
        if (this.wins > 0) {
            finishedProduct = finishedProduct + "\nLast Win: " + this.yearLastWin + " (" + (currentYear - (yearLastWin + 1)) + " years)";
        } else {
            finishedProduct = finishedProduct + "\nLast Win: No Wins in Indycar";
        }
        if (this.titles > 0) {
            finishedProduct = finishedProduct + "\nLast Title: " + this.yearLastTitle + " (" + (currentYear - (yearLastTitle + 1)) + " years)";
        } else {
            finishedProduct = finishedProduct + "\nLast Title: No Indycar/CART Titles";
        }
        if (this.indyWins > 0) {
            finishedProduct = finishedProduct + "\nLast Indy 500 Win: " + this.yearLastIndyWin + " (" + (currentYear - (yearLastIndyWin + 1)) + " years)";
        } else {
            finishedProduct = finishedProduct + "\nLast Indy 500 Win: No Wins";
        }

        return finishedProduct;
    }
}
