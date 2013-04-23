package config;

public class LauncherConfig {

	public static String serverName;
    public static String serverAddress = "85.214.205.124";
    public static String chatServerAddress = "85.214.205.124";
    public static String updaterAddress = "http://ygopro.de/launcher/checkversion.php";
    public static String serverInfoAddress = "http://ygopro.de/launcher/serverinfo.php";
    public static int serverPort = 6922;
    public static String defaultServer = "";
    
    public static int gamePort = 6911;
    public static int chatPort = 6666;
    public static String gameExe = "devpro.dll";
    public static String launcherDir =  "";
    public static String defaultUsername = "";
    public static String defaultDeck = "";
    public static Boolean enableSound = true;
    public static Boolean enableMusic = true;
    public static Boolean enabled3D = false;
    public static int antialias = 0;
    public static Boolean autoLogin = false;
    public static Boolean fullscreen = false;
    public static String password = "";
    public static String gameFont = "simhei.ttf"; //only ger
    public static String chatFont = "";
    public static int fontSize = 12; //only ger
    public static float chatSize = 8.25f;
    public static String language = "English"; // confirm Language
    public static Boolean useSkin = false;
    public static Boolean autoPlacing = true;
    public static Boolean randomPlacing = false;
    public static Boolean autoChain = true;
    public static Boolean noChainDelay = false;
    public static String ignoreList = "";

    //quickhost settings
    public static String banList = "";
    public static String timeLimit = "3 minutes";
    public static String cardRules = "OCG/TCG";
    public static String mode = "Single";
    public static Boolean enablePrority = false;
    public static Boolean disableCheckDeck = false;
    public static Boolean disableShuffleDeck = false;
    public static String lifepoints = "8000";
   //public static String GameName = LauncherHelper.GenerateString().SubString(0, 5);
    public static Boolean debugMode = false;

    //chat settings
    public static Boolean hideJoinLeave = true;
    public static Boolean colorBlindMode = false;
    public static Boolean showTimeStamp = false;
    public static Boolean refuseDuelRequests = false;
    public static Boolean pmWindows = true;
    public static Boolean usernameColors = true;
    public static Boolean refuseTeamInvites = false;

//    public SerializableColor ChatBGColor = new SerializableColor(Color.White);
//    public SerializableColor NormalTextColor = new SerializableColor(Color.Black);
//    public SerializableColor Level99Color = new SerializableColor(Color.Green);
//    public SerializableColor Level2Color = new SerializableColor(Color.Red);
//    public SerializableColor Level1Color = new SerializableColor(Color.RoyalBlue);
//    public SerializableColor Level0Color = new SerializableColor(Color.Black);
//    public SerializableColor ServerMsgColor = new SerializableColor(Color.Red);
//    public SerializableColor MeMsgColor = new SerializableColor(Color.DeepPink);
//    public SerializableColor JoinColor = new SerializableColor(Color.Green);
//    public SerializableColor LeaveColor = new SerializableColor(Color.Gray);
//    public SerializableColor SystemColor = new SerializableColor(Color.Purple);

    public static String chtBanList = "";
    public static String chtTimeLimit = "3 minutes";
    public static String chtCardRules = "OCG/TCG";
    public static String chtMode = "Single";
    public static Boolean chtEnablePrority = false;
    public static Boolean chtDisableCheckDeck = false;
    public static Boolean chtDisableShuffleDeck = false;
    public static String chtLifepoints = "8000";
    //public String chtGameName = LauncherHelper.GenerateString().SubString(0, 5);
    public static Boolean configReset181000 = true;
    public static Boolean newUpdate = false;
}
