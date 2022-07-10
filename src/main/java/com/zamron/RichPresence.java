package com.zamron;


import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;

public class RichPresence {
    private final String CLIENT_ID = "934871343613218856"; //872829622302146622

    private DiscordRPC lib;
    private DiscordRichPresence presence;

    public void initiate() {
        lib = DiscordRPC.INSTANCE;
        DiscordEventHandlers handlers = new DiscordEventHandlers();
        lib.Discord_Initialize(CLIENT_ID, handlers, true, "");
        presence = new DiscordRichPresence();
        presence.startTimestamp = System.currentTimeMillis() / 1000;
        presence.largeImageKey = "logo";
        presence.smallImageKey = "home";
        updatePresence();
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                lib.Discord_RunCallbacks();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        }, "RPC-Callback-Handler").start();
    }

    public void updateDetails(String details) {
        presence.details = details;
        updatePresence();
    }

    public void updateState(String state) {
        presence.state = state;
        updatePresence();
    }

    public void updateBigHoverText(String hoverBigImageText) {
        presence.largeImageText = hoverBigImageText;
        updatePresence();
    }

    public void updateSmallHoverText(String hoverSmallImageText) {
        presence.smallImageText = hoverSmallImageText;
        updatePresence();
    }

    public void updateSmallImageKey(String key) {
        presence.smallImageKey = key;
        updatePresence();
    }

    private void updatePresence() {
        lib.Discord_UpdatePresence(presence);
    }
}
