package xyz.merith.bariputer.mixin;

import xyz.merith.bariputer.BariputerInit;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class EntryPointMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		BariputerInit.LOGGER.warn("[Bariputer] [WARN] Server Admins, if you see this message, your player has sent you logs from an client with an automation mod installed. Take action accordingly.");
		BariputerInit.LOGGER.info("[Bariputer] [INFO] Loading Mixins");
	}
}
