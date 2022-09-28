//package String;
//
//
//import static com.google.common.base.Ascii.equalsIgnoreCase;
//import static sun.security.util.Debug.args;
//
//public class MyString {
//    private char [] charArray;
//
//    public MyString(String s) {
//        this.charArray = s.toCharArray();
//    }
//    public int indexOf(String subString, boolean ignoreCase) {
//        char [] subStringCharArray = subString.toCharArray();
//        int lengthOfSubString = subString.length();
//        char [] subArray = new char[lengthOfSubString];
//
//        for (int i = 0; i <= charArray.length-lengthOfSubString ; i++) {
//            for (int j = 0; j < lengthOfSubString; j++) {
//                subArray[j] = charArray[j + i];
//            }
//            int j = 0;
//            while(j < subArray.length){
//                if (ignoreCase){
//                    if(String.valueOf(subArray[j])).equalsIgnoreCase(String.valueOf(subStringCharArray[j]))){
//                    break;
//             }else{
//             if(String.valueOf(subArray[j])).equals(String.valueOf(subStringCharArray[j]));
//             break;
//                    }
//                }
//                j++;
//            }
//            if (j == subArray.length){
//                return  -1;
//            }
//        }
//            public static void main(String[] args) {
//            MyString s = new MyString("Ehis");
//            int value = s.indexOf("His", false);
//            System.out.println(value);
//
//        }
//    }
//
//}
//
//
