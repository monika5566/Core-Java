package exceptionhandling;

public class studentInfo {
  
	private int stdId;
	private float percentage;
	private String name ;
	
	//Getter Setter method
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(double d) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void show()
	{
		try
		{
			studIdValidator.ValidateStudId(stdId);
			//PercentageValidator.isValidPercentage(per);
			System.out.println("Student details : ");
			System.out.println("StudentID : "+stdId+"\tName : "+name+"\tPercentage : "+percentage);
		}
		catch(invalidException e)
	
		{
			
			System.out.println(e.getMessage());
			
	}
		}
 
}