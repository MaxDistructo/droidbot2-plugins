package maxdistructo.droidbot2.plugin.error404

public class eventHandler{


@EventSubscriber
public static void onMessageRecievedEvent(MessageRecievedEvent event){
try{
IMessage message = event.getMessage();
IUser author = message.getAuthor();
IGuild guild = message.getGuild();
Object[] messageContent = message.getContent().split(" ");
String prefix = Config.readPrefix();

if(guild.getName().equals("Error 404 - Name Not Found")){

if(messageContent[0].equals(prefix + "request"))

}


}
catch(Exception e){

Message.throwError(e);

}
}

}
