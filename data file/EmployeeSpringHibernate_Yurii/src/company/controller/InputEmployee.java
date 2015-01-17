package company.controller;

public interface InputEmployee {
static final String TERMINATOR = "exit";
static final int INDEX_TYPE=0;
static final int INDEX_ID=1;
static final int INDEX_NAME=2;
static final int INDEX_SALARY = 3;
static final String SEPARATOR = " ";
EmployeeData getEmployeeData();
}
