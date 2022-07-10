// 
// Decompiled by Procyon v0.5.36
// 

package com.zamron;

public class ClientDebugConfiguration
{
    public static final boolean TEST_474_CACHE = false;
    public static boolean DEBUG_SPRITES;
    public static boolean LOCAL_CACHE;
    public static boolean NO_CLIP_COMMAND;
    public static boolean DOWNLOAD_LATEST_CACHE;
    public static boolean FORCE_LOG_IN;
    public static boolean DEBUG_MODE;
    public static boolean DEBUG_INTERFACES;
    public static int FORCE_OPEN_INTERFACE;
    public static boolean DUMP_SPRITES;
    public static int INTERFACE_DEFINITION_TO_DEBUG;
    public static boolean PRINT_ALL_EXCEPTION;
    public static boolean RELOAD_INTERFACE_DISABLED;
    
    static {
        ClientDebugConfiguration.DEBUG_SPRITES = true;
        ClientDebugConfiguration.LOCAL_CACHE = false;
        ClientDebugConfiguration.NO_CLIP_COMMAND = true;
        ClientDebugConfiguration.DOWNLOAD_LATEST_CACHE = false;
        ClientDebugConfiguration.FORCE_LOG_IN = false;
        ClientDebugConfiguration.DEBUG_MODE = true;
        ClientDebugConfiguration.DEBUG_INTERFACES = false;
        ClientDebugConfiguration.FORCE_OPEN_INTERFACE = 0;
        ClientDebugConfiguration.DUMP_SPRITES = false;
        ClientDebugConfiguration.INTERFACE_DEFINITION_TO_DEBUG = 0;
        ClientDebugConfiguration.PRINT_ALL_EXCEPTION = false;
        ClientDebugConfiguration.RELOAD_INTERFACE_DISABLED = false;
    }
}
