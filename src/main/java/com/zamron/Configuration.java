package com.zamron;

public class Configuration {

	public static final int CLIENT_VER = 1; // Client Version

	public static final boolean LOCAL = false; //Change this lol

	public final static String HOST = LOCAL ? "127.0.0.1" : "135.148.45.207";
	// 							      Local? 		  Yes : No
	public final static String JAGGRAB_HOST = "localhost";
    public static String SERVER_NAME = "Zamron";
	public final static int PORT = 43595;
	public final static String CLIENT_NAME = "Zamron";

	/**
	 * The NPC bits. 12 = 317/377 14 = 474+ 16 = 600+
	 */
	public final static int NPC_BITS = 18; //Don't change from 18

	public static final boolean JAGCACHED_ENABLED = false;

	public static int FOG_BEGIN_DEPTH = 2000; //2000

	public static int FOG_END_DEPTH = 3000; //3000

	public static final int[] packetSizes = { 0, 0, 0, 1, 6, 0, 0, 0, 4, 0, // 0
			0, 2, -1, 1, 1, -1, 1, 0, 0, 0, // 10
			0, 0, 0, 0, 1, 0, 0, -1, 1, 1, // 20
			0, 0, 0, 0, -2, 4, 3, 0, 2, 0, // 30
			0, 0, 0, 0, 5, 8, 0, 6, 0, 0, // 40
			9, 0, 0, -2, 0, 0, 0, 0, 0, 0, // 50
			-2, 1, 0, 0, 2, -2, 0, 0, 0, 0, // 60
			6, 3, 2, 4, 2, 4, 0, 0, 0, 4, // 70
			0, -2, 0, 0, 7, 2, 1, 6, 6, 0, // 80
			0, 0, 0, 0, 0, 0, 0, 2, 0, 1, // 90
			2, 2, 0, 1, -1, 4, 1, 0, 1, 0, // 100
			1, 1, 1, 1, 2, 1, 0, 15, 0, 0, // 110
			0, 4, 4, -1, 9, 0, -2, 2, 0, -1, // 120 // 9
			-1, -1, -1, -1, 9, 0, 0, 0, 0, -1, // 130
			3, 10, 2, 0, 0, 0, 0, 14, 0, 0, // 140
			0, 4, 5, 3, 0, 0, 3, 0, 0, 0, // 150
			4, 5, 0, 0, 2, 0, 6, 0, 0, 0, // 160
			// 0, 3, /*0*/ -1, 0, 5, 7, 10, 6, 5, 1, //170
			0, 3, -2, -2, 5, 5, 10, 6, 5, -2, // 170
			0, 0, 0, 2, 0, 2, 0, -1, 0, 0, // 180
			6, 0, 0, -2, 0, 2, -1, 2, -1, 6, // 190
			4, 10, 0, 3, 0, -1, 3, 10, 4, 4, // 200
			0, 0, 0, 0, -1, 7, 0, -2, 2, 0, // 210
			-1, 1, -2, -2, 0, 0, 0, 0, 0, 0, // 220
			8, 0, 3, 0, 0, 0, 0, 0, 0, 0, // 230
			2, -2, 0, 0, -1, 0, 6, 0, 4, 3, // 240
			-1, 0, 0, -1, 6, 0, 0// 250
	};

	public static final int statMenuColor = 0xFF6600; //0x0E8B8B

	public static String NAME = "Zamron - A Truly Unique Experience";

	public static boolean ctrlHoverHint = true;
}
