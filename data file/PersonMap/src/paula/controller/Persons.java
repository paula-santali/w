package paula.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import paula.model.Address;
import paula.model.PersonInfo;

public class Persons {
	private int ageMax;
	private int nameMax;
	private int countryMax;
	private int cityMax;
	private int streeMax;
	private int bldMax;
	private int appMax;
	Random rand =new Random();
	public Persons(int ageMax, int nameMax, int countryMax, int cityMax,
			int streeMax, int bldMax, int appMax) {
		super();
		this.ageMax = ageMax;
		this.nameMax = nameMax;
		this.countryMax = countryMax;
		this.cityMax = cityMax;
		this.streeMax = streeMax;
		this.bldMax = bldMax;
		this.appMax = appMax;
	}
	 public static int  id=1;
	 GregorianCalendar calendar=new GregorianCalendar();
	 
	public PersonInfo createPersonInfo(){
		//int name=rand.nextInt(nameMax);
		calendar.add(Calendar.YEAR, -ageMax);
		
		return new PersonInfo(id++, "Name"+rand.nextInt(nameMax), calendar.getTime(), createAddress());
		
	}
	public Address createAddress(){
		return new Address("Country"+rand.nextInt(countryMax), "City"+rand.nextInt(cityMax), "Street"+rand.nextInt(streeMax),
				rand.nextInt(bldMax), rand.nextInt(appMax));
		
	}


}
