package maxdistructo.droidbot2.commands.casinogames;

public class ModuleCasinoGames implements IModule{

	private String moduleName = "Casino - Games Extention";
	private String moduleVersion = "1.0";
	private String moduleMinimumVersion = "2.9.0";
	private String author = "MaxDistructo";
	public static IDiscordClient client;
  	public static EventDispatcher dispatcher;
	
	public void disable() {
		
	}

	public boolean enable(IDiscordClient dclient) {
    try {
      Class.forName( "maxdistructo.droidbot2.commands.casino.ModuleCasino"); //Require Base Casino Module
      Class.forName( "maxdistructo.droidbot2.core.Utils"); //Require droidbot2-core (Shall be repackaged as a module as well)
    } catch( ClassNotFoundException e ) {
      return false;
    }
		client = dclient;
		dispatcher = client.getDispatcher();
		dispatcher.registerListener(new MessageHandler());
		return true;
	}


	public String getAuthor() {
		return author;
	}

	public String getMinimumDiscord4JVersion() {
		return moduleMinimumVersion;
	}

	public String getName() {
		return moduleName;
	}

	public String getVersion() {
		return moduleVersion;
	}

}
