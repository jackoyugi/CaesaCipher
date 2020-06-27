package models;

public class Encrypt {

    private String mInputString;
    private int mShift;

    public Encrypt(String mInputString, int mShift) {
        this.mInputString = mInputString;
        this.mShift = mShift;
    }
    public String getmInputString(){
        return mInputString;
    }
    public int getmShift() {
        return mShift;
    }
    public static String encrypt(Encrypt encrypt){
        if (encrypt.mShift> 26) {
            encrypt.mShift = encrypt.mShift % 26;
        } else if (encrypt.mShift<0) {
            encrypt.mShift = (encrypt.mShift%26) + 26;
        }
        String outPutString = "";
        int length = encrypt.mInputString.length();
        for (int i=0; i< length; i++) {
            char ch = encrypt.mInputString.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char)(ch-encrypt.mShift);
                    if (c< 'a') {
                        outPutString += (char) (ch + (26-encrypt.mShift));
                    } else  {
                        outPutString +=c;
                    }
                } else if (Character.isUpperCase(ch)){
                    char c = (char)(ch-encrypt.mShift);
                    if (c<'A') {
                        outPutString += (char)(ch + (26-encrypt.mShift));
                    } else {
                        outPutString += c;
                    }
                }
            }else  {
                outPutString += ch;
            }
        }
        return outPutString;
    }

}
