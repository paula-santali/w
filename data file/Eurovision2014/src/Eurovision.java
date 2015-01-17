
public class Eurovision {
	private String country;
	private String NameSinger;
	private String singel;

	public Eurovision(){

	}
	public Eurovision(String country,String NameSinger,String singel){
		if(country!="")
			this.country=country;
		else
			System.out.println("Error in parameter country");
		if(NameSinger!="")
			this.setNameSinger(NameSinger);
		else
			System.out.println("Error in parameter NameSinger");
		if(singel!="")
			this.setSingel(singel);
		else
			System.out.println("Error in parameter singel");

	}
	public void setCountry(String country){
		if(country!="")
			this.country=country;
		else
			System.out.println("Error in parameter country");
	}
	public String getContry(){
		return country;
	}
	public void setNameSinger(String NameSinger) {
		if(NameSinger!="")
			this.NameSinger=NameSinger;
		else
			System.out.println("Error in parameter NameSinger");
	}
	public String getNameSinger() {
		return NameSinger;
	}
	public void setSingel(String singel) {
		if(singel!="")
			this.singel=singel;
		else
			System.out.println("Error in parameter singel");

	}
	public String getSingel() {
		return singel;
	}
	public void display(){
		System.out.print("\n country->"+country);
		System.out.print("\t NameSinger->"+NameSinger);
		System.out.print("\t singel->"+singel);

	}


}
