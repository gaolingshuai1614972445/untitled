package H日志;

import java.util.Formatter;
import java.util.logging.*;

public class Test {
    public static void main(String[] args)
    {
        Logger logger = Logger.getGlobal();//基本日志
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();//FileHandler();
//        handler.setLevel(Level.FINER);
//        //ls ~ 能看到java.long的文件，里面就是日志
//        logger.addHandler(handler);
//        logger.setLevel(Level.FINER);
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        Filter filter = new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getMessage().length() < 6 ? false : true;
            }
        };//过滤


        Logger.getGlobal().info("info");
        Logger.getGlobal().warning("waring");
        Logger.getGlobal().severe("sever");
        Logger.getGlobal().config("config");
        Logger.getGlobal().fine("fine");
        Logger.getGlobal().finer("finer");
        Logger.getGlobal().finest("finest");
        /*重点记住这7个级别就可以*/
    }
}
