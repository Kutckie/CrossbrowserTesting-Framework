import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/* *Config init file */

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("test.conf");
    }
    /**
     * config constants
     */
    String TEST_LOGIN = readConfig().getString("usersParams.woocomerceGeneralUsers.testUser.login");
}
