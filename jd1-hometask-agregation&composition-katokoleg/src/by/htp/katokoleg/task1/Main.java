package by.htp.katokoleg.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Word word1 = new Word("My");
		Word word2 = new Word("name");
		Word word3 = new Word("is");
		Word word4 = new Word("Oleg.");
		
		Word word5 = new Word("I'm");
		Word word6 = new Word("30");
		Word word7 = new Word("years");
		Word word8 = new Word("old.");
		
		Word word9 = new Word("I");
		Word word10 = new Word("like");
		Word word11 = new Word("to");
		Word word12 = new Word("swimming.");
		
		List<Word> words1 = new ArrayList<Word>(); 
		words1.add(word1);
		words1.add(word2);
		words1.add(word3);
		words1.add(word4);
		
		List<Word> words2 = new ArrayList<Word>(); 
		words2.add(word5);
		words2.add(word6);
		words2.add(word7);
		words2.add(word8);
		
		List<Word> words3 = new ArrayList<Word>(); 
		words3.add(word9);
		words3.add(word10);
		words3.add(word11);
		words3.add(word12);
			
		Sentence sentence1 = new Sentence(words1);
		Sentence sentence2 = new Sentence(words2);
		Sentence sentence3 = new Sentence(words3);
		
		List<Sentence> sentences = new ArrayList<Sentence>();
		sentences.add(sentence1);
		
		Text text = new Text (sentences, "About myself");
		text.addText(sentence2);
		text.addText(sentence3);
		
		System.out.println(text.getTitle());
		text.outputText(text);
		
	}

}
