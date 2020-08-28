import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MyReaderClass {

	public static List<input_dao> readCsv(String path) throws Exception
	{
		List<input_dao> inputs=new ArrayList<input_dao>();
		File input_file= new File(path);
		FileReader f_input=new FileReader(input_file);
		
		BufferedReader br=new BufferedReader(f_input);
		String line;
		String city;
		String country;
		String currency;
		String gender;
		String amount;
		line=br.readLine();
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			String[] input_array=line.split(",");
			if(input_array.length>0) {
				city=input_array[0];
				country=input_array[1];
				gender=input_array[2];
				currency=input_array[3];
				amount=input_array[4];
				if(currency.equals("INR"))
				{
					currency="USD";
					amount= Integer.toString((Integer.parseInt(amount)/66));
				}
				else if(currency.equals("GBP"))
				{
					currency="USD";
					amount= Integer.toString(((Integer.parseInt(amount)*67)));
				}
				else if(currency.equals("HKD"))
				{
					currency="USD";
					amount= Integer.toString((Integer.parseInt(amount)/8));
				}
				else if(currency.equals("SGD"))
				{
					currency="USD";
					amount= Integer.toString(((Integer.parseInt(amount)/15)*10));
				}
				
				input_dao ob= new input_dao(city, country, gender, currency, amount);
				inputs.add(ob);
			}
			
		}
		f_input.close();
		return inputs;
	}
}
