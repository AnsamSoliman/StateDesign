package StatePattern;

public class StatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(2);
		st.State();
		st.setYear(4);
		st.State();
	    st.setYear(1);
	    st.State();


	}

}
