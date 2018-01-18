package maxdistructo.droidbot2.commands.casino;

public class ModuleCasino implements IModule{

	private String moduleName = "Casino";
	private String moduleVersion = "1.0";
	private String moduleMinimumVersion = "2.9.0";
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