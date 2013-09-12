package log;

public class LogTrace {
	public static LogLevel logFlag = LogLevel.debug;
	public static enum LogLevel{debug,log};
	public static void log(LogLevel level, String message, Object obj) {
		String className = obj.getClass().getName();
		
		switch (level) {
		case debug:
			System.out.println("[debug] "+className+" "+message);
			break;
		case log:
			System.out.println("[log]" + className+" "+message);
			break;
		default:
			break;
		}
	}
}
