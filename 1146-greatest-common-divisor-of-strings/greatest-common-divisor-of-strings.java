class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int lengthStr1 = str1.length();
        int lengthStr2 = str2.length();

        int substringIndex = getGreatestCommonDivisor(lengthStr1, lengthStr2);

        String greatestCommonDivisorOfStrings = str1.substring(0, substringIndex);

        return greatestCommonDivisorOfStrings;
    }

    private int getGreatestCommonDivisor(int num1, int num2) {
        while(num2 != 0) {
            int tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
        }

        return num1;
    }
}