import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ProgramRunner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   //"C:\Users\rohan dutt\Downloads\input_file"
		args[0]="C:\\Users\\rohan dutt\\Downloads\\input_file.csv";
		String input_file_url=args[0];
		String output_file_url=args[1];
		
		
		Model_Class model_Class= new Model_Class(MyReaderClass.readCsv(input_file_url));
		model_Class.sortValuesbyCity();
	//	System.out.println(model_Class.getList());
		
		MyWriterClass.writeCsv(model_Class.getList(),"C:\\Users\\rohan dutt\\Downloads\\outut_file.csv" ,"city");
		
		
	}

}
