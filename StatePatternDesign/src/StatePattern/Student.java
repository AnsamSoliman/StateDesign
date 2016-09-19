package StatePattern;

public class Student {
	private int year;
	private StudentState st;
	Student(int year){
	this.year=year;
	this.setYear(year);
		
	}
	public void setYear(int year2) {
		// TODO Auto-generated method stub
		
		if(year2==1){
		st=new First();	

		}
		else if(year2==2){	
	    st=new Seconed();	

		}
		else if(year2==4){
		st=new Forth();	

			
		}
		else{
			System.out.println("not found");
			
			
		}
		
		
	}
	
	public void State(){
		
		st.state();
		
	}
	
	

}
