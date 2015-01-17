package controller;

import paula.model.PersonInfoModel;

public class WrongRequest extends Request{

	@Override
	public String[] runRequest(PersonInfoModel persons) {
		
		return new String[]{"Wrong request!!!"};
	}

}
