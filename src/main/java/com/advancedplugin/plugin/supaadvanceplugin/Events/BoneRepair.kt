package com.advancedplugin.plugin.supaadvanceplugin.Events

import com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems.CustomItems
import com.advancedplugin.plugin.supaadvanceplugin.Core.SameItemChecker
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffectType


@Suppress( "DEPRECATION")
class BoneRepair: Listener, CustomItems()  {

    @EventHandler
    fun onFixerClick(event: PlayerInteractEvent){

        if(event.item == CustomItems.BoneFixer){
            val eventAction: Action = event.action
            val eventItemType: Material? = event.item?.type
            val eventItem: ItemStack? = event.item
            val iteminoffHand =  event.player.inventory.itemInOffHand
            val iteminMainHand = event.player.inventory.itemInMainHand

            /* if((event.action == Action.RIGHT_CLICK_AIR || event.action == Action.RIGHT_CLICK_BLOCK ||
                         event.action == Action.LEFT_CLICK_AIR || event.action == Action.LEFT_CLICK_BLOCK)
                  && event.item?.type == Material.STICK && event.item == CustomItems.BoneFixer &&
                 event.player.inventory.itemInOffHand != event.player.inventory.itemInMainHand){


                 event.player.removePotionEffect(PotionEffectType.SLOW)
                 event.player.inventory.itemInMainHand.subtract(1)
             }
             else if((event.action == Action.RIGHT_CLICK_AIR || event.action == Action.RIGHT_CLICK_BLOCK ||
                         event.action == Action.LEFT_CLICK_AIR || event.action == Action.LEFT_CLICK_BLOCK)
                 && event.item?.type == Material.STICK && event.item == CustomItems.BoneFixer  &&
                 event.player.inventory.itemInMainHand != event.player.inventory.itemInOffHand){



                 event.player.removePotionEffect(PotionEffectType.SLOW)
                 event.player.inventory.itemInOffHand.subtract(1)

             }*/


            val test: Int = SameItemChecker().checkHandsForSameItems(eventAction, eventItemType,eventItem,
                event.player,iteminMainHand,iteminoffHand)

            if(test == 1){
                event.player.removePotionEffect(PotionEffectType.SLOW)
                event.player.inventory.itemInMainHand.subtract(1)

            }else if(test == 2){
                event.player.removePotionEffect(PotionEffectType.SLOW)
                event.player.inventory.itemInOffHand.subtract(1)

            }else{

            }



        }
        }



}