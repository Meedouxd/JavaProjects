public class Command {
    private String[] list = {"mth","end","cmd","rdm","prt","clr","crt","del"};
    public String getList(int x){
        return list[x];
    }
    public void determineCommand(String command){
        boolean isACommand = false;
        String commandSuffix = "";
        String commandRoot =  "" + command.charAt(0) + command.charAt(1) + command.charAt(2);

        for(int i = 0; i < list.length; i++){
            if(commandRoot.equals(list[i])){
                processCommand(i, commandSuffix);
                isACommand = true;
                if(command.charAt(3) == (' ')){
                    System.out.println("big ol command");
                }
            }
        }
        if(!isACommand){
            System.out.println("Error: that is not a command");
        }
    }
    public void processCommand(int cmdnmbr, String commandSuffix){
        switch(cmdnmbr){
            case(0):
                cmdmth(commandSuffix);
                break;
            case(1):
                cmdend();
                break;
            case(2):
                cmdcmd();
                break;
            case(3):
                cmdrdm(commandSuffix);
                break;
            case(4):
                cmdprt(commandSuffix);
                break;
            case(5):
                cmdclr(commandSuffix);
                break;
            case(6):
                cmdcrt(commandSuffix);
                break;
            case(7):
                cmddel(commandSuffix);
                break;
        }
    }
    public void cmdmth(String cmdsfx){

    }
    public void cmdend(){

    }
    public void cmdcmd(){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ",");
        }
        System.out.println();
    }
    public void cmdrdm(String cmdsfx){

    }
    public void cmdprt(String cmdsfx){
        System.out.println(cmdsfx);
    }
    public void cmdclr(String cmdsfx){

    }
    public void cmdcrt(String cmdsfx){

    }
    public void cmddel(String cmdsfx){

    }
}
