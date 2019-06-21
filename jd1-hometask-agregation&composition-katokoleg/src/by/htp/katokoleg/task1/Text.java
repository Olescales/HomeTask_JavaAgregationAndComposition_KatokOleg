package by.htp.katokoleg.task1;

import java.util.List;

public class Text {

		private List<Sentence> sentences;
		private String title;
		
		public Text (List<Sentence> sentences, String title) {
			this.sentences = sentences;
			this.title = title;
		}
		
		public Text () {
		
		}
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}


		public List<Sentence> getSentence() {
			return sentences;
		}

		public void setSentence(List<Sentence> sentences) {
			this.sentences = sentences;
		}

		public void addText (List<Sentence> newsentences) {
			this.sentences.addAll(newsentences);
		}
		
		public void addText (Sentence text) {
			this.sentences.add(text);
		}
		
		public void outputText (Text text) {
			System.out.println(text);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Text other = (Text) obj;
			if (sentences == null) {
				if (other.sentences != null)
					return false;
			} else if (!sentences.equals(other.sentences))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return sentences  + title ;
		}
		
}
