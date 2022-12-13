public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message){
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":") + 1);
    }

    public boolean containsWord(String word){
        String newDescription = " " + description + " ";
        String newWord = " " + word + " ";
        if(newDescription.contains(newWord)){
            return true;
        } return false;
    }

}
