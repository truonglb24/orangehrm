package commons;

public class GlobalConstants {

    // System info
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String JAVA_VERSION = System.getProperty("java.version");
    public static final String SEPARATOR = System.getProperty("file.separator");


    public static final String URL_CLIENT = "https://yasai-test.yakuodo-info.com/login";
    public static final String URL_ADMIN = "https://yasai-console-dev.yakuodo-info.com/login";

    public static final String ACCOUNT = "truonglb@rabiloo.com";
    public static final String PASSWORD = "123123";

    // HTML Report Folder
    public static final String EXTENT_PATH = PROJECT_PATH + SEPARATOR + "htmlExtent" + SEPARATOR;

    // Message validate
    public static final String MESSAGE_REQUIRED = "この項目は必須です。";

}
