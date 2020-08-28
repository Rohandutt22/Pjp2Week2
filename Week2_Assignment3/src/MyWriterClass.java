import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MyWriterClass {

	
	public static void writeCsv(List<input_dao> list,String path,String type) throws Exception
	{
        File output_file=new File(path);
		
		FileWriter f_output=new FileWriter(output_file);
		
		BufferedWriter br=new BufferedWriter(f_output);
		String line;
		for(input_dao ob:list)
		{
			
			if(type=="city")
			{
				line=ob.getCity()+","+ob.getGender()+","+ob.getAmount()+",\n";
				
			}
			else
			{
				line=ob.getCountry()+","+ob.getGender()+","+ob.getAmount()+",\n";
			}
			System.out.println(line);
			br.write(line);
		}
		br.flush();
		f_output.close();
	}
}
