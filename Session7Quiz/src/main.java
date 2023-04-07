import java.util.Scanner;
public class orang {
	
	String name,dob;
	
	Person(String name, String dob){
		this.name = name;
		this.dob = dob;
	}
	
	void viewPerson() {
		System.out.println("Name is " + name);
		System.out.println("Born on " +dob);
	}
	
	void sleep() {
		System.out.println("Person" + name + "is sleeping");
	}


}


public class siswa extends orang{
	int Sid,poin;
	
	Mahasiswa(String name, String dob, int Sid){
		this.poin = 0;
		super(name,dob);
		this.Sid = Sid;
		
	}
	
	void helpDosen() {
		this.poin +=10;
	}
	
	void viewMahasiswa() {
		super.viewPerson();
		System.out.println("Sid = " +Sid);
		System.out.println("poin= " +poin);
	}

}

public class Doseng extends orang{
	int codeDosen;
	
	Dosen(String name, String dob, int codeDosen){
		super(name,dob);
		this.codeDosen = codeDosen;
	}
	
	void selfDev() {
		System.out.println(name+"is self developing");
		
	}
	void teach() {
		System.out.println(name+"is teaching");
		
	}
	void p2m() {
		System.out.println(name+"is currently doing p2m");
		
	}
	void research() {
		System.out.println(name+"is researching");
		
	}
	void otherWorks() {
		System.out.println(name+"is working");
		
	}
	void viewDosen() {
		super.viewPerson();
		System.out.println("dosen code :" +codeDosen);
	}
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		Scanner sc= new Scanner(System.in);
		System.out.println("Please select [Person,Mahasiswa,Dosen]");
		String a = sc.nextLine();
		
		switch(a) {
		case "Person" :
			System.out.println("input name and dob: ");
			orang person =  new orang(sc.nextLine(),sc.nextLine());
			person.sleep();
			person.viewPerson();
			
		case "Mahasiswa" :
			System.out.println("input name , dob, and Sid: ");
			siswa b =  new siswa(sc.nextLine(),sc.nextLine(),sc.nextLine());
			b.helpDosen();
			b.viewMahasiswa();
		case "Dosen" :
			System.out.println("input name , dob, and code dosen: ");
			Doseng c =  new Doseng(sc.nextLine(),sc.nextLine(),sc.nextLine());
			c.selfDev();
			c.teach();
			c.p2m();
			c.research();
			c.otherWorks();
			c.viewDosen();
					
		}
	}

}
