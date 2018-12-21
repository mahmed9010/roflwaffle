package com.company;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        String numString = Integer.toString(num);
        for(int i = 0;i<numString.length();i++)
        {
            digitList.add(Integer.parseInt(numString.substring(i,i+1)));
        }
    }

    public boolean isStrictlyincreasing()
    {
        for(int i = 0;i<digitList.size();i++)
        {
            if(digitList.get(i)>digitList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }
}
