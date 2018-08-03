import java.util.ArrayList;
import java.util.List;

public class Sentence {
	private String sentence;
	
	public Sentence(String sent) {
		sentence = sent;
	}
	
	public Sentence() {
		sentence = "";
	}
	
	public List<Integer> getBlanckPosition() {
		
		List<Integer> blanks = new ArrayList<Integer>();
		
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.substring(i, i+1).equals(" ")) {
				blanks.add(i);
			}
		}		
		return blanks;
	}
	
	public int countWords(){
		List<Integer> blanks = getBlanckPosition();
		
		return blanks.size() + 1;
	}
	
	public String[] getWords() {
		List<Integer> posList = getBlanckPosition();
		int numWords = countWords();
		String[] wordArr = new String[numWords];
		
		for(int i = 0; i<numWords; i++) {
			if(i == 0) {
				if(posList.size() != 0)
					wordArr[i] = sentence.substring(0, posList.get(0));
				else 
					wordArr[i] = sentence;
			}
			
			else if(i == posList.size()) 
				wordArr[i] = sentence.substring(posList.get(i-1));
		
			else 
				wordArr[i] = sentence.substring(posList.get(i-1),posList.get(i));
		}
		return wordArr;
	}
}
