package controller;

import java.sql.SQLException;

import paula.model.*;

public abstract class Request {
protected String[] data;
public   abstract String[] runRequest(PersonInfoModel persons) throws NumberFormatException, SQLException;
}
