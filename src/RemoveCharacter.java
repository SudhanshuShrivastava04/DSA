public class RemoveCharacter {
    public static void main(String[] args) {
        String inputString = "abcabcabc";
        String resultString01 = removeChar(inputString,'a');
        String resultString02 = removeCharUsingReplace(inputString, 'b');
        System.out.println(resultString01);
        System.out.println(resultString02);
    }

    public static String removeChar(String str, char charToRemove){
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch != charToRemove){
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String removeCharUsingReplace(String str, char charToRemove){
        return str.replace(String.valueOf(charToRemove), "");
    }


}
