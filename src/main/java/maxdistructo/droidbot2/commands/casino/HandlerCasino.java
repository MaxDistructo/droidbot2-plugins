package maxdistructo.droidbot2.commands.casino;

public class HandlerCasino{

public static void onMessageRecievedEvent(MessageRecievedEvent event){
       IMessage message = event.getMessage();
       IGuild guild = message.getGuild();
       IUser author = message.getAuthor();
       IUser mentioned = Utils.getMentionedUser(message);
       String content = message.getContent();
       Object messageContent[] = content.split(" ");

                if (messageContent[0].equals(prefix + "casino") && messageContent[1].equals("info") && mentioned != null && Perms.checkGames(message)) { //Works except for admin commands
                    message.reply("", Casino.onCasinoInfo(message, mentioned));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "casino") && messageContent[1].equals("info") && Perms.checkGames(message)) { //Works except for admin commands
                    message.reply("", Casino.onCasinoInfo(message));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "casino") && Perms.checkGames(message)) { //Works except for admin commands
                    message.reply("", Message.simpleEmbed(message.getAuthor(), "Casino", Casino.onCasinoCommand(messageContent, message, message.getAuthor()), message));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "50") || messageContent[0].equals(prefix + "fifty") && Perms.checkGames(message)) { //Works
                    message.reply("", Message.simpleEmbed(message.getAuthor(), "FiftyFifty", FiftyFifty.onFiftyCommand(messageContent, message), message));
                    message.delete();
                } else if (messageContent[0].equals(prefix + "allin") && Perms.checkGames(message)) {
                    message.reply("", Message.simpleEmbed(message.getAuthor(), "Allin", Allin.onAllinCommand(messageContent, message), message));
                    message.delete();
                }
                
                
          }

}
