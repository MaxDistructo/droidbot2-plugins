package maxdistructo.droidbot2.commands.playerfun;

public class ListenerPlayerFun{

public static void onMessageRecieved(MessageRecievedEvent event){
  
            IMessage message = event.getMessage();
            IUser mentioned = Utils.getMentionedUser(message);

                  if (messageContent[0].equals(prefix + "slap")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onSlapCommand(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "tnt")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onTntCommand(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "kiss")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onKissCommand(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "hug")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onHugCommand(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "poke")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onPokeCommand(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "respect") || messageContent[0].equals("/f")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onPayRespects(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "banhammer")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onBanHammer(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "shoot")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onShootCommand(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "stab")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onStabCommand(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "xp")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onXpCommand(mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "punch")) {
                    Message.sendMessage(message.getChannel(), PlayerFun.onPunchCommand(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "spam")) {
                    Message.sendMessage(message.getChannel(), Spam.onSpamCommand(messageContent, message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "insult")) { //Works
                    Message.sendMessage(message.getChannel(), Message.simpleEmbed(message.getAuthor(), "Insult", Insult.onInsultCommand(messageContent, message, mentioned), message));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "fortune")) { //Works
                    message.reply("", Message.simpleEmbed(message.getAuthor(), "Fortune", Fortune.onFortuneCommand(messageContent, message), message));
                    message.delete();
                } 

}

}
