package curs2;

public class Rectangle {
	
	int lungime;
	int latime;
	int inaltime;
	
    public int calculArie() {
		
		return lungime * latime;
	}
	
	
	public int calculPerimetru(int lungime, int latime) {
		
		return 2 * (lungime + latime);
	}
	
	//constructor default
	public Rectangle() {}
	
	public Rectangle(int lungime, int latime) {
		this.lungime = lungime;
		this.latime = latime;
	}


}