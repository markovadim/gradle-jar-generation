package ru.clevertec.stringutils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        return !org.apache.commons.lang3.StringUtils.isAlpha(str)&& Double.parseDouble(str)>0;
    }
}
