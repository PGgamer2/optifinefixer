package com.pg.optifinefixer;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "optifinefixer";
    private static final Logger LOGGER = LogUtils.getLogger();
	
    public Main() {
        LOGGER.debug("Optifine Fixer has started");
    }
}
