package xyz.merith.bariputer.client;

import net.minecraft.text.LiteralText;

public class BariputerGUI {
    net.minecraft.client.MinecraftClient client; // create a new variable for the minecraft client
    public static void openGUI(net.minecraft.client.MinecraftClient client) {
        client.player.sendMessage(new LiteralText("[Bariputer] Opening GUI"), false); // send a message to the player
    }
}
