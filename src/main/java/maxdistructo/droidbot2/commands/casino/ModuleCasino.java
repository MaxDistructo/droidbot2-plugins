package maxdistructo.droidbot2.commands.casino;

public class ModuleCasino implements IModule{

	private String moduleName = "Casino";
	private String moduleVersion = "1.0";
	private String moduleMinimumVersion = "2.9.0";
	private String author = "MaxDistructo";
	public static IDiscordClient client;
  	public static EventDispatcher dispatcher;
	public static String prefix;
	
	public void disable() {
		
	}

	public boolean enable(IDiscordClient dclient) {
		try {
 			Class.forName( "maxdistructo.droidbot2.core.ModuleDroidBot2Core" ); //Checks for droidbot2-core to be in classpath
			prefix = Utils.readPrefix(); //Require config file for prefix
		} catch( Exception e ) {
			e.printStackTrace();
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
