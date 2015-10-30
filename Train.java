
package trains;
//this is the Train Class, it was created to make a list of trains with their required information
public class Train {
    private String trainName;
    private String routeName;
    private String runNumber;
    private String operId;

    public Train(String trainName, String routeName, String runNumber, String operId){
        super();
        this.trainName=trainName;
        this.routeName=routeName;
        this.runNumber=runNumber;
        this.operId=operId;
    }


    public String getTrainName(){
        return trainName;
    }

    public String getRouteName(){
        return routeName;
    }
    
    public String getRunNumber(){
        return runNumber;
    }

    public String getOperId(){
        return operId;
    }
    public void setTrainName(String tn){
        this.trainName=tn;
            }
    public void setRouteName(String rn){
        this.routeName=rn;
    }
    public void setRunNumber(String runnum){
        this.runNumber=runnum;
    }
    public void setOperId(String oid){
        this.operId=oid;
    }

    public void printTrain(){
        System.out.printf("%-15s%-15s%-15s%-15s\n", trainName, routeName, runNumber, operId);
    }
    
    


}
