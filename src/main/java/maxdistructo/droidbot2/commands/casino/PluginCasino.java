package maxdistructo.droidbot2.commands.casino;

public class PluginCasino implements IModule{

	private String moduleName = "Error 404 - Name Not Found/Custom Commands";
	private String moduleVersion = "1.0";
	private String moduleMinimumVersion = "2.3.0";
	private String author = "MaxDistructo";
	public static IDiscordClient client;
  	public static EventDispatcher dispatcher;
	
	public void disable() {
		
	}

	public boolean enable(IDiscordClient dclient) {
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
