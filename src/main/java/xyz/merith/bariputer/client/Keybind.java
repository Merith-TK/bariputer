package xyz.merith.bariputer.client;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import xyz.merith.bariputer.client.BariputerGUI;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralText;
import org.lwjgl.glfw.GLFW;
import xyz.merith.bariputer.BariputerInit;

public class Keybind {
    private static KeyBinding keyBinding;
    public static void register() {
        BariputerInit.LOGGER.info("Registering keybind");

        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.bariputer.toggle",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_MENU,
                "category.bariputer.bariputer"
        ));
        BariputerInit.LOGGER.info("Registered keybind");
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                BariputerGUI.openGUI(client);
            }
        });


    }
}
