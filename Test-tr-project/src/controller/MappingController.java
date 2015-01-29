package controller;
import java.util.ArrayList;
import java.util.List;

import log.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/"})
public class MappingController {	
	@Autowired
	ApplicationAction DBservice;

	/** when application is run this method getting home page !! */
	@RequestMapping({"/"})
	public String homePage() {return "HomePage";}


	/** when pressed button add question! this method is only calling a adding page !! */
	@RequestMapping({"/add"})
	public String addingPage() {return "AddingPage";}


	/** when pressed button update question! this method is only calling a updating view table page !! */
	@RequestMapping({"/update"})
	public String UpdatePage(){return "UpdatePage";}


	/** when pressed button add from file! this method is only calling a adding page !! */
	@RequestMapping({"/addfromfile"})
	public String specificDataPage(){return "addFromFile";}

	/**
	 * Adding Question method Action
	 * @param question_text
	 * @param category
	 * @param question_level
	 * @param answer_text
	 * @param trueAnswerNumber
	 * @param model
	 * @return
	 */
	@RequestMapping({"/add_actions"})
	public String addProcessingPage(String question_text,String category,int question_level,String answer_text_1,String answer_text_2,String answer_text_3,String answer_text_4 ,int trueAnswerNumber,Model model){

		model.addAttribute("result",question_text+category+question_level+answer_text_1+trueAnswerNumber );// text on page for testing

		/**
		 * the way from client to service this method is returning boolean
		 */

		List<String> answer = new ArrayList<String>();
		answer.add(answer_text_1);
		answer.add(answer_text_2);
		answer.add(answer_text_3);
		answer.add(answer_text_4);

		DBservice.createQuestion(question_text, category, question_level, answer, trueAnswerNumber);


		return "AddingPage"; // return too page after action
	}

	/**
	 * 
	 * @param question
	 * @param model
	 * @return
	 */
	@RequestMapping({"/update_actions"})
	public String updateProcessingPage(String question, Model model){	
		/**
		 * the way from client to service this method is returning boolean
		 */
		StringBuffer str;
		List<Object> result = DBservice.UpdateQuestionInDataBase(question, null);
		str = new StringBuffer();
		str.append("<table style='border:0.1em solid black; width:100%;'>");
		for(Object obj:result){			
			str.append("<tr><td style='border:0.1em solid black;'>"+obj.toString()+"</tr></td>");
		}	
		str.append("</table><br>");
		model.addAttribute("result", str);// text on page for testing
		return "UpdatePage";// return too page after action
	}

	@RequestMapping({"/action"})
	public String ProcessingPage(String question_out, Model model){


		return null;	
	}


	/**
	 * @param file_name
	 * @param model
	 * @return
	 */
	@RequestMapping({"/add_from_file_actions"})
	public String addFromFileProcessingPage(String file_name, Model model){
		String res = "addFromFile";
		model.addAttribute("result", file_name);// text on page for testing
		logger.log(file_name);
		res = "HomePage";
		return 	res;// return too page after action
	}
}
