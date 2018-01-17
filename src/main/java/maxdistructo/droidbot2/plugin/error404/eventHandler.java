package maxdistructo.droidbot2.plugin.error404

import maxdistructo.droidbot2.core.*;

public class eventHandler{


@EventSubscriber
public static void onMessageRecievedEvent(MessageRecievedEvent event){
  IMessage message = event.getMessage();
try{
IUser author = message.getAuthor();
IGuild guild = message.getGuild();
Object[] messageContent = message.getContent().split(" ");
String prefix = Client.prefix;
IChannel modmail = guild.getChannel(L); //More Placeholders
IChannel request = guild.getChannel(L); 
IChannel report = guild.getChannel(L);

if(guild.getLongID() == L){ //Another debug ID placeholder

if(messageContent[0].equals(prefix + "request")){
  Message.sendDM(author, "Your request for access to [" + messageContent[1] + "] has been sent to the Admins. Please wait for a DM from an Admin.");
  Message.sendMessage(request,"User " + author.getName() + "#" + author.getDiscrim() + " has requested access to [" + messageContent[1] +"].");//Guild.getChannel is holding the spot for the Debug ID of a currently non-existant channel.
  message.delete();
}
  else if(messageContent[0].equals(prefix + "report")){
    Message.sendDM(author, "User " + Utils.getMentionedUser(message).getName() + "#" + Utils.getMentionedUser(message).getDiscrim() + " has been sucessfully reported for " Utils.makeNewString(messageContent, 3) + ". If you abuse this system, you may be banned from using it. If this was a mistake, please use !modmail \"Sorry but my last report is a mistake\" or something of the like.");
    Message.sendMessage(report, "User " + author.getName() + "#" + author.getDiscrim() + " has reported " + Utils.getMentionedUser(message).getName() + "#" + Utils.getMentionedUser(message).getDiscrim() + "for " + Utils.makeNewString(messageContent, 3));
    message.delete();
  }
  else if(messageContent[0].equals(prefix + "modmail")){
    Message.sendMessage(modmail, author.getName() + "#" + author.getDiscrim() + ": " + Utils.makeNewString(messageContent, 3));
    message.delete();
  }
  //This command is in beta and may be ported into DroidBot2 code at a later date

}


}
catch(Exception e){

Message.throwError(e, message);

}
}

}
