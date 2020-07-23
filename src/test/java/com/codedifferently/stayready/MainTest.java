package com.codedifferently.stayready;

import org.junit.Assert;
import org.junit.Test;
public class MainTest {
    @Test
    public void toUSDTest() {
        Main tester = new Main();
        Double currency = tester.malaysianRinggit;
        Double amount = 5.00;
        Double expected = 1.12;
        Double actual = tester.toUSD(currency, amount);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void fromUSDTest() {
        Main tester = new Main();
        Double currency = tester.malaysianRinggit;
        Double usConversion = 5.00;
        Double expected = tester.fromUSD(currency, usConversion);
        Double actual = tester.fromUSD(currency, usConversion);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void wholeConversionTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.malaysianRinggit;
        Double afterCurrency = tester.chineseYuanRenminbi;
        Double amount = 5.00;
        Double expected = 7.74;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    //various Tests for readMe
    @Test
    public void dollarToEuroTest() {
        Main tester = new Main();
        Double afterCurrency = tester.euro;
        Double amount = 5.00;
        Double expected = 4.70;
        Double actual = tester.fromUSD(afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void euroToDollarTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.euro;
        Double amount = 5.00;
        Double expected = 5.32;
        Double actual = tester.toUSD(beforeCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void euroToBritishPoundTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.euro;
        Double afterCurrency = tester.britishPound;
        Double amount = 5.00;
        Double expected = 4.36;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void britishPoundToIndianRupeeTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.britishPound;
        Double afterCurrency = tester.indianRupee;
        Double amount = 5.00;
        Double expected = 417.8;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void indianRupeeToCanadianDollarTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.indianRupee;
        Double afterCurrency = tester.canadianDollar;
        Double amount = 5.00;
        Double expected = 0.10;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void canadianDollarToSingaporeDollarTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.canadianDollar;
        Double afterCurrency = tester.indianRupee;
        Double amount = 5.00;
        Double expected = 259.55;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void singaPoreDollarToSwissFrancTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.singaporeDollar;
        Double afterCurrency = tester.swissFranc;
        Double amount = 5.00;
        Double expected = 3.53;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void swissFrancToMalaysianRinggitTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.swissFranc;
        Double afterCurrency = tester.malaysianRinggit;
        Double amount = 5.00;
        Double expected = 22.13;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void malaysianRinggitToJapaneseYenTest() {
        Main tester = new Main();
        Double beforeCurrency = tester.malaysianRinggit;
        Double afterCurrency = tester.japaneseYen;
        Double amount = 5.00;
        Double expected = 129.57;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void japaneseYenToChineseYuanRenminbi() {
        Main tester = new Main();
        Double beforeCurrency = tester.japaneseYen;
        Double afterCurrency = tester.chineseYuanRenminbi;
        Double amount = 5.00;
        Double expected = 0.30;
        Double actual = tester.wholeConversion(beforeCurrency, afterCurrency, amount);
        Assert.assertEquals(expected, actual);
    }
}
