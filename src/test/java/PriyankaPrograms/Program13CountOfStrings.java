package PriyankaPrograms;

public class Program13CountOfStrings {
    public static void main(String[] args) {
        String string = "Hi this is priyanka thorat and this is programing practice.";
        String[] token = string.split("");
        int strLength = token.length;
        String occurence;
        int count = 0;

        for(int i=0; i<strLength;i++)
        {
            occurence = token[i];
            count = 1;
            for(int j =(i+1); j<strLength-1;j++) {
                if(occurence.equals(token[j])){
                    count++;
                }

            }
            
        }
    }
}
