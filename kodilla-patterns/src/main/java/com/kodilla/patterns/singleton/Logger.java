package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger SettingLoggerInstance = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (SettingLoggerInstance == null) {
            synchronized(Logger.class) {
                if (SettingLoggerInstance == null) {
                    SettingLoggerInstance = new Logger();
                }
            }
        }
        return SettingLoggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
