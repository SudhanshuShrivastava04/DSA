public class RemoveCharacter {
    public static void main(String[] args) {
        String inputString = "abcabcabc";
        String resultString = removeChar(inputString,'a');
        System.out.println(resultString);
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

}
