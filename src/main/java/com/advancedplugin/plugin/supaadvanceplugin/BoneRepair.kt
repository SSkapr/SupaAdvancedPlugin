package com.advancedplugin.plugin.supaadvanceplugin

import org.bukkit.Material
import org.bukkit.entity.Item
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType


@Suppress( "DEPRECATION")
class BoneRepair: Listener {

    @EventHandler
    fun onFixerClick(event: PlayerInteractEvent){



        val boneFixer = ItemStack(Material.ARMOR_STAND)
        if((event.action == Action.RIGHT_CLICK_AIR || event.action == Action.RIGHT_CLICK_BLOCK ||
                    event.action == Action.LEFT_CLICK_AIR || event.action == Action.LEFT_CLICK_BLOCK)
             && event.item?.type == Material.ARMOR_STAND && event.item?.itemMeta?.displayName == "Bone Fixer" &&
            event.player.inventory.itemInOffHand.itemMeta?.displayName != "Bone Fixer"){
            var used: Boolean = false



                event.player.removePotionEffect(PotionEffectType.SLOW)
            event.player.inventory.itemInMainHand.subtract(1)


        }
        else if((event.action == Action.RIGHT_CLICK_AIR || event.action == Action.RIGHT_CLICK_BLOCK ||
                    event.action == Action.LEFT_CLICK_AIR || event.action == Action.LEFT_CLICK_BLOCK)
            && event.item?.type == Material.ARMOR_STAND && event.item?.itemMeta?.displayName == "Bone Fixer" &&
            event.player.inventory.itemInMainHand.itemMeta?.displayName != "Bone Fixer"){
            var used: Boolean = false



            event.player.removePotionEffect(PotionEffectType.SLOW)
            event.player.inventory.itemInOffHand.subtract(1)



        }

    }

}