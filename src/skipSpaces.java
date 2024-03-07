public class skipSpaces {
    public static void main(String[] args) {
        String inputString = "Hello Welcome to Java";
        String resultString = skip(inputString);
        System.out.println(resultString);
    }

    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(" ")){
            return skip(up.substring(1));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }

}
