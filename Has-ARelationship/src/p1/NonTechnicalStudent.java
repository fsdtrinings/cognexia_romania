package p1;

public abstract class NonTechnicalStudent extends Student{

	private String eventName;
	
	NonTechnicalStudent()
	{
		super(101,"X",0,"Not issued");
	}

	
}


class HistoryStudents extends NonTechnicalStudent
{

	@Override
	public void doProjectWork() {
		// TODO Auto-generated method stub
		
	}
	
}

class LanguageStudent extends NonTechnicalStudent
{
	@Override
	public void doProjectWork() {
		// TODO Auto-generated method stub
		
	}
}
