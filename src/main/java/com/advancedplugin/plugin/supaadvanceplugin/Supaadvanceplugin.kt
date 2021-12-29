package com.advancedplugin.plugin.supaadvanceplugin

import org.bukkit.plugin.java.JavaPlugin

class Supaadvanceplugin : JavaPlugin() {
    override fun onEnable() {

        logger.info("Enabled")
        server.pluginManager.registerEvents(BoneBreaker(),this)
        server.pluginManager.registerEvents(BoneRepair(),this)

    }
    override fun onDisable() {
        // Plugin shutdown logic
    }
}