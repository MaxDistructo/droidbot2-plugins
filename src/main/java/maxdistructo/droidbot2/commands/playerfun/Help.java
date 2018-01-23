package maxdistruco.droidbot2.commands.playerfun;

import static maxdistructo.droidbot2.commands.playerfun.ModulePlayerFun.prefix;

public class Help{

// All modules that integrate with DroidBot2-Core must contain this help script. This will be located at ~/droidbot/help.txt for the actual help command to grab.

public static void onHelpCommand(){

List<String> helpFile = Config.readHelpJson();

helpFile.add(prefix + "slap Usage: " + prefix + "slap @User - Slaps the mentinoed user. ");
helpFile.add(prefix + "tnt Usage: " + prefix + "tnt @User - Blows up the mentioned user. ");
helpFile.add(prefix + "kiss Usage: " + prefix + "kiss @User - Kisses the mentioned user.");
helpFile.add(prefix + "hug Usage: " + prefix + "hug @User - Hugs the mentioned user.");


}

}
