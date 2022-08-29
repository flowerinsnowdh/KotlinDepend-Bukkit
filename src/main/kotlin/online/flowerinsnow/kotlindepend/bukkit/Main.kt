package online.flowerinsnow.kotlindepend.bukkit

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        logger.info("Enabled")
    }

    override fun onDisable() {
        logger.info("Disabled")
    }
}