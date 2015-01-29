package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Answer {
	public Answer() {

	}

	@ManyToOne
	Question quest;
	@Id
	@GeneratedValue
	protected long keyQuestion;// autogenereted
	protected String answerText;
	protected int numberOfAnswer;
	protected boolean answer;
	protected Question getQuest() {
		return quest;
	}

	protected void setKeyQuestion(long keyQuestion) {
		this.keyQuestion = keyQuestion;
	}

	protected void setQuest(Question quest) {
		this.quest = quest;
	}

	protected String getAnswerText() {
		return answerText;
	}
	protected void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	protected int getNumberOfAnswer() {
		return numberOfAnswer;
	}
	protected void setNumberOfAnswer(int numberOfAnswer) {
		this.numberOfAnswer = numberOfAnswer;
	}
	protected boolean isAnswer() {
		return answer;
	}
	protected void setAnswer(boolean answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "Answer quest=" + quest + ", answerText="
				+ answerText + ", numberOfAnswer=" + numberOfAnswer
				+ ", answer=" + answer ;
	}

}
