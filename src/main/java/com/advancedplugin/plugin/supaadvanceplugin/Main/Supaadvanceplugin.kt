package com.advancedplugin.plugin.supaadvanceplugin.Main

import com.advancedplugin.plugin.supaadvanceplugin.Events.BoneBreaker
import com.advancedplugin.plugin.supaadvanceplugin.Events.BoneRepair
import com.advancedplugin.plugin.supaadvanceplugin.Commands.GetBoneFixerCommand
import com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems.Booster
import com.advancedplugin.plugin.supaadvanceplugin.Core.MakeCustomItems
import com.advancedplugin.plugin.supaadvanceplugin.Core.SameItemChecker
import com.advancedplugin.plugin.supaadvanceplugin.Events.BooosterBoost
import org.bukkit.plugin.java.JavaPlugin

class Supaadvanceplugin : JavaPlugin() {
    override fun onEnable() {

        logger.info("Enabled")


        MakeCustomItems().initializeItems()

        getCommand("getdafixer")?.setExecutor(GetBoneFixerCommand())
        server.pluginManager.registerEvents(BoneBreaker(),this)
        server.pluginManager.registerEvents(BoneRepair(),this)
        server.pluginManager.registerEvents(SameItemChecker(),this)
        server.pluginManager.registerEvents(Booster(),this)


    }
    override fun onDisable() {
        // Plugin shutdown logic
    }

}