package com.codedifferently.stayready;

public class Main {
    double usDollar = 1.00;
    double euro = 0.94;
    double britishPound = 0.82;
    double indianRupee = 68.52;
    double australianDollar = 1.35;
    double canadianDollar = 1.32;
    double singaporeDollar = 1.43;
    double swissFranc = 1.01;
    double malaysianRinggit = 4.47;
    double japaneseYen = 115.84;
    double chineseYuanRenminbi = 6.92;
    double usConversion;
    double finalConversion;
    double roundTwo;


    //final or constructor
    public Double toUSD(double currency, double amount) {
        double firstStepConversion = amount * usDollar;
        usConversion = firstStepConversion / currency;
        roundTwo = Math.round(usConversion * 100.0) / 100.0;
        return roundTwo;
    }
    public Double fromUSD(double Currency, double usConversionNeeded) {
        double firstStepConversion = Currency * usConversionNeeded;
        finalConversion = firstStepConversion / usDollar;
        roundTwo = Math.round(finalConversion * 100.0) / 100.0;
        return roundTwo;
    }
    public Double wholeConversion(double beforeCurrency, double afterCurrency, double amount){
        toUSD(beforeCurrency, amount);
        fromUSD(afterCurrency, usConversion);
        roundTwo = Math.round(finalConversion * 100.0) / 100.0;
        return roundTwo;
    }
}
