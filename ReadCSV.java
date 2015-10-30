package trains;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSV {

	public static void main(String[] args) {
		
			String filecsv = args[0];  //this is used to get the location of the csv file
		    String head1= "Train Name";
		    String head2= "Route";
		    String head3= "Run Number";
		    String head4= "Operator Id";
		    System.out.println("Please enter the csv file with the directory (for eg. /home/user/file.csv)");
		   //allows the user to enter the csv file
		    String comma_delimiter=",";//this helps tokenize the line
		    int tname=0;
		    int rname=1;
		    int rnumber=2;
		    int oid=3;
		// TODO Auto-generated method stub
		    BufferedReader fileReader=null;
		 //  Scanner in = new Scanner(System.in);//This is what gets the input from the user for the location of csv file
		  // filecsv=in.nextLine();
	    
		   
		   try{
	    	List trains=new ArrayList();//makes a list of trains using the Train class created
	        String line ="";
	        fileReader= new BufferedReader(new FileReader(filecsv));
	        fileReader.readLine();
	        System.out.printf("%-15s%-15s%-15s%-15s %n", head1, head2, head3, head4);
	        System.out.print("********************************************************************\n");
	        int counter=0;
	        while ((line=fileReader.readLine()) != null){
	            String[] tokens = line.split(comma_delimiter);
	            if (tokens.length >0){
	                //System.out.printf("%-15s%-15s %-15s %-15s %n", tokens[0], tokens[1], tokens[2], tokens[3]);//used to print trains without sorting
	            	Train train = new Train(tokens[tname], tokens[rname], tokens[rnumber], tokens[oid]);
	            	trains.add(train);//adds a new train to the current existing list of trains
	            	//train.printTrain(); //Prints the train as it is read from the list
	            	
	            }
	            
	        } 
	        
	        //This block of code sorts the list of trains by comparing the runNumber
	        if (trains.size()> 0){
	        	Collections.sort(trains, new Comparator<Train>() {
	        		public int compare(Train t1, Train t2){
	        			return t1.getRunNumber().compareTo(t2.getRunNumber());
	        		}
	        	});
	        }
	        
	        //This block prints the list of trains out already
	        for (int i=0; i<trains.size(); i++){
	        	((Train) trains.get(i)).printTrain();
	        	
	        }
	        
		    }catch (Exception e) {
		    	System.out.println("Error trying to read file");
		      e.printStackTrace();	
	    }
	    


	}

}
