package src.rajesh.stringManipulations;


//        Given two version numbers, version1 and version2, compare them.
//
//        Version numbers consist of one or more revisions joined by a dot '.'. Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.
//
//        To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their integer value ignoring any leading zeros. This means that revisions 1 and 001 are considered equal. If a version number does not specify a revision at an index, then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.
//
//        Return the following:
//
//        If version1 < version2, return -1.
//        If version1 > version2, return 1.
//        Otherwise, return 0.


public class ComplareVersionNumbers {

    public static int compareVersion(String version1, String version2){
        String [] version1_arr = version1.split(".");
        String [] version2_arr = version2.split(".");
        int num1=0,num2=0;
        for(int i=0,j=0;i<=version1.length()||j<=version2.length();){
            while(i<version1.length()&&version1.charAt(i)!= '.'){
                num1 =num1*10 + (version1.charAt(i) - '0');
                i++;
            }
            while(j<version2.length()&&version2.charAt(j)!= '.'){
                num2 =num2*10 + (version2.charAt(j) - '0');
                j++;
            }
            if(num1>num2){
                System.out.println("Version1 is greater");
                return 1;
            }else if(num2>num1){
                System.out.println("Version2 is greater");
                return -1;
            }
            if(version1.charAt(i)-'0' > version2.charAt(j) - '0'){
                System.out.println("Version1 is greater");
                return 1;
            }else {
                System.out.println("Version2 is greater");
                return -1;
            }

        }

        return 0;
    }
    public static void main(String []args){
        compareVersion("1.001","1.01");
    }
}
