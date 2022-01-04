package com.advancedplugin.plugin.supaadvanceplugin.Commands

import com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems.Booster
import com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems.CustomItems
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class GetBoneFixerCommand: CommandExecutor {


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val player: Player = sender as Player
        if(command.name.equals("getdafixer")){
            player.inventory.addItem(CustomItems.BoneFixer)
            player.inventory.addItem(Booster.Boooster)
        }


        return true
    }
}