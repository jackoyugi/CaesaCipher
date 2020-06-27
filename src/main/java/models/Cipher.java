package models;

    public class Cipher {
        private String mInputString;
        private int mShift;

        String letters = "hjkjhljbvkx xbx";
        String encode = "";
        String decode = "";


        public  Cipher(String mInputString, int mShift){
        this.mInputString = mInputString;
        this.mShift = mShift;
         };
        public String getmInputString(){
            return mInputString;
        }
        public int getmShift() {
            return mShift;
        }
        public String encrypt(){
            if(mShift>26){
                mShift = mShift%26;
            }
            else if (mShift<0){
                mShift=(mShift%26)+26;
            }
            String cipherText ="";
            int length = mInputString.length();
            for(int i = 0; i<length; i++){
                char ch = mInputString.charAt(i);
                if(Character.isLetter(ch)){
                    if(Character.isLowerCase(ch)){
                        char c = (char)(ch+mShift);
                        if(c > 'z'){
                            cipherText += (char)(ch-(26-mShift));
                        } else {
                            cipherText += c;
                        }
                    } else if(Character.isUpperCase(ch)){
                        char c = (char)(ch+mShift);
                        if(c > 'Z'){
                            cipherText += (char)(ch-(26-mShift));
                        } else {
                            cipherText += c;
                        }

                    }
                } else{
                    cipherText +=ch;
                }
            }return cipherText;
        }
        public String decrypt(){
            if(mShift>26){
                mShift = mShift%26;
            }
            else if (mShift<0){
                mShift=(mShift%26)+26;
            }
            String cipherText ="";
            int length = mInputString.length();
            for(int i = 0; i<length; i++){
                char ch = mInputString.charAt(i);
                if(Character.isLetter(ch)){
                    if(Character.isLowerCase(ch)){
                        char c = (char)(ch-mShift);
                        if(c < 'a'){
                            cipherText += (char)(ch+(26-mShift));
                        } else {
                            cipherText += c;
                        }
                    } else if(Character.isUpperCase(ch)){
                        char c = (char)(ch-mShift);
                        if(c < 'A'){
                            cipherText += (char)(ch+(26-mShift));
                        } else {
                            cipherText += c;
                        }

                    }
                } else{
                    cipherText +=ch;
                }
            }return cipherText;
        }
        public static void main (String[] args) {

        }


    }


