package day16_nestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";

        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while (sentence.contains(word)){

            count++;
            sentence = sentence.replaceFirst(word,"");//"Java Java Java Java"
        }

        System.out.println(count);


    }

}
/*
2.  Write a program that can return the frequency of the word java from a sentence
	    Ex:
	        sentence = "java JAVA jAvA JAva"

	    output:
	        4

	ex:         "Java Java Java Java"; // count = 0;
	         " Java Java Java" // count = 1;
	         " Java Java " // count = 2;
	         " Java" // count = 3;
	         "" // count = 4;
 */