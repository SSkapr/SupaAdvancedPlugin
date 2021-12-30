package com.advancedplugin.plugin.supaadvanceplugin.Events

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.InventoryInteractEvent
import org.bukkit.event.inventory.InventoryMoveItemEvent

class SameItemChecker: Listener {


    @EventHandler
    fun checkHandsForSameItems(event: InventoryInteractEvent){

        val eventPlayr = event as Player

        if(eventPlayr.inventory.itemInMainHand == eventPlayr.inventory.itemInOffHand){
            if(eventPlayr.inventory.itemInMainHand.itemMeta?.displayName == "Bone Fixer" &&
                eventPlayr.inventory.itemInOffHand.itemMeta?.displayName == "Bone Fixer" ){


                //needs to remove specific item and then add it back so the item is not in the off hand
                eventPlayr.inventory.removeItem()
            }


        }
    }
}