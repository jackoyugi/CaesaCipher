package models;

public class Decrypt {

    private String mInputString;
    private int mShift;

    public Decrypt(String mInputString, int mShift){
        this.mInputString = mInputString;
        this.mShift = mShift;

    }
    public String getmInputString() {
        return mInputString;
    }
    public int getmShift() {
        return mShift;
    }
    public static String decrypt(Decrypt decrypt){
        //getting the length of the string should not be more than 26 letters;
        if (decrypt.mShift> 26) {
            decrypt.mShift = decrypt.mShift % 26;
        }
        // letters are 1-25 with no negative integers
        else if (decrypt.mShift < 0) {
            decrypt.mShift = (decrypt.mShift % 26) + 26;
        }
        //looping through the string-for loop
        String outPutString = "";
        int length = decrypt.mInputString.length();
        for (int i= 0; i < length; i++) {
            char ch = decrypt.mInputString.charAt(i);
            if(Character.isLetter(ch)) {
                if(Character.isLowerCase(ch)) {
                    char c = (char)(ch-decrypt.mShift);
                    if(c<'a') {
                        outPutString += (char)(ch + (26-decrypt.mShift));
                    }else {
                        outPutString += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char)(ch-decrypt.mShift);
                    if (c<'A') {
                        outPutString += (char)(ch + (26-decrypt.mShift));
                    }else {
                        outPutString += c;
                    }
                }
            }else {
                outPutString += ch;
            }
        }
        return outPutString;
    }

}
