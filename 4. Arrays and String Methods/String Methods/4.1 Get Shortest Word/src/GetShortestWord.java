public class GetShortestWord
{

    public static String getShortestWord(String word1, String word2){
        if(word1.length() > word2.length()){
            return word2;
        }else{
            return word1;
        }

    }
}