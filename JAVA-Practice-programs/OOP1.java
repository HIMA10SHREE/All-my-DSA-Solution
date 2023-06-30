//Simple constructor

/*class Employees{
	int id ;
	String name;

	public void info(){
		System.out.println(this.id);
		System.out.println(this.name);
	}

	Employees(){
		System.out.println("hii");
	
	}
}



class OOP1{
	public static void main(String args[]){
		Employees e1=new Employees();
		e1.id=1234;
		e1.name="Shukla";
		e1.info();

	}
}
*/


//Parameterised constructor

/*class Employees{
	int id ;
	String name;

	

	Employees(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println(this.id);
		System.out.println(this.name);
	
	}
}



class OOP1{
	public static void main(String args[]){
		Employees e1=new Employees(1234,"Shukla");
		
		

	}
}
*/


//Copy constructor
/*class Employees{
	int id ;
	String name;

	

	Employees(Employees e2){
		this.id=e2.id;
		this.name=e2.name;
		System.out.println(this.id);
		System.out.println(this.name);
	
	}
	Employees(){

	}
}



class OOP1{
	public static void main(String args[]){
		Employees e1=new Employees();
		e1.id=123;
		e1.name="Aman";
		Employees e2=new Employees(e1);
		
		

	}
}
*/


//Function Overloading

/*class Employees{
	int id ;
	String name;

	

	public void printInfo(String name){
		System.out.println(name);
	}

	public void printInfo(int id){
		System.out.println(id);
	}

	public void printInfo(String name,int id){
		System.out.println(name+" "+id);
	}



	//Employees(){

	
}



class OOP1{
	public static void main(String args[]){
		Employees e1=new Employees();
		e1.id=123;
		e1.name="Aman";
		//e1.printInfo(e1.name);
		e1.printInfo(e1.id);
		
		

	}
}

*/



