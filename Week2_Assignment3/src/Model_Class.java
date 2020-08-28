import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Model_Class {
	
	
	private List<input_dao> inputs;
	
	public Model_Class()
	{
		inputs=new ArrayList();
	}
	public Model_Class(List<input_dao> l2)
	{
		inputs=l2;
	}
	public void add_input(input_dao ob)
	{
		inputs.add(ob);
	}
	
	public void sortValuesbyCity()
	{
		inputs.sort(new Comparator<input_dao>() {

			@Override
			public int compare(input_dao o1, input_dao o2) {
				if(o1.getCity().compareTo(o2.getCity())<0)
					return -1;
				else if(o1.getCity().compareTo(o2.getCity())==0)
				{
					if(o1.getGender().compareTo(o2.getGender())!=0)
						return o1.getGender().compareTo(o2.getGender());
					else
						return o1.getAmount().compareTo(o2.getAmount());
				}
				else
			
				return 1;
			}
		});
	}
	public List<input_dao> getList()
	{
		return inputs;
	}

}
