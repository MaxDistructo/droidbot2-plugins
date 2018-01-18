package maxdistructo.droidbot2.commands.casinogames;

import static maxdistructo.droidbot2.commands.casinogames.ModuleCasinoGames.prefix;

public class HandlerCasinoGames{

public static void onMessageRecievedEvent(MessageRecievedEvent event){
       IMessage message = event.getMessage();
       IGuild guild = message.getGuild();
       IUser author = message.getAuthor();
       IUser mentioned = Utils.getMentionedUser(message);
       String content = message.getContent();
       Object messageContent[] = content.split(" ");
       
                  if (messageContent[0].equals(prefix + "bj")) { 
                    message.reply(BlackJack.blackjack(messageContent, message));
                } else if (messageContent[0].toString().toLowerCase().equals("hit") && Perms.checkGames(message) || messageContent[0].toString().toLowerCase().equals("stay") && Perms.checkGames(message)) {
                    message.reply(BlackJack.continueGame(message, (String[]) messageContent, CasinoConfig.readBJFields(message)));
                }
                
                
       }


}
