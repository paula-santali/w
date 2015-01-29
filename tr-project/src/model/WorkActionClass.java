package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import log.logger;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class WorkActionClass implements ApplicationAction {
	@PersistenceContext(unitName="springHibernate", type=PersistenceContextType.EXTENDED)
	EntityManager em;

	static private final String USER="root";
	static private String PASSWORD ="12345.com";
	int j=1;

	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)	
	public boolean createQuestion(String question, String category,	int level, List<String> answers, int trueAnswerNumber) {
		boolean result = false;
		if(em.find(Question.class, question) == null){
			Question qwtemp = new Question();
			qwtemp.setQuestion(question);
			qwtemp.setCategory(category);
			qwtemp.setLevel(level);

			for (String answer: answers ) {
				addAnswersList(answer,trueAnswerNumber);
			}
			j=1;
			em.persist(qwtemp);
			result = true;
		}	
		System.out.println(question + " "+category+" "+level+" "+answers+" "+trueAnswerNumber);
		return result;
	}	
	private void addAnswersList(String answer, int trueAnswerNumber) {
		Answer temp = new Answer();// creating table answer
		temp.setAnswerText(answer);
		if(trueAnswerNumber==j){
			temp.setAnswer(true);// adding boolean if true/false this answer 
		}else{
			temp.setAnswer(false);// adding boolean if true/false this answer 
		}
		temp.setNumberOfAnswer(j++);
		em.persist(temp);
	}

	@Override
	public List<Object> UpdateQuestionInDataBase(String question, String category) {
		Statement statament;
		List<Object> result = new ArrayList<Object>();
		ResultSet rs;
		try {
			statament = DatabaseConnection.getDatabaseConnection(USER, PASSWORD);
			rs = statament.executeQuery("SELECT question from Question where question like '%"+question+"%'");
			while(rs.next()){
				result.add(rs.getObject(1));
			}
		} catch (Exception e1) {e1.printStackTrace();}
		logger.log(result);
		return result;
	}

	@Override
	public boolean AddQuestionsFromFile(String FileName) {
		// TODO Auto-generated method stub
		return false;
	}

	// методы которым надо придумать применение для возврата других результатов согласно проэкту
	// возможно использование при обновлении чтоб вернуть выбранный вопрос администратору для работы с ним
	@Override
	public String[] getAnySingleQuery(String strQuery) {
		Query query=em.createQuery(strQuery);
		List <Object> result =query.getResultList();
		String [] array= new String[result.size()];
		int index=0;
		for( Object obj:result)
			array[index++]=obj.toString();
		return array;

	}

	@Override
	public String[] getAnyMultipleQuery(String strQuery ) {
		Query query=em.createQuery(strQuery);
		List <Object[]> result =query.getResultList();
		String [] array= new String[result.size()];
		int ind=0;
		for(Object[] arObj:result){
			String strResult =arObj[0].toString();
			for(int i=1;i<arObj.length;i++)
				strResult+=" "+arObj[i].toString();
			array[ind++]=strResult;
		}
		return array;
	}	
}

