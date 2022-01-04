package com.advancedplugin.plugin.supaadvanceplugin.Events

import com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems.Booster
import com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems.CustomItems
import com.advancedplugin.plugin.supaadvanceplugin.Core.SameItemChecker
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack


class BooosterBoost: Listener  {

    //Here will be code to implement boosting player to height with Boooster



    fun onBooostPlayer(event: PlayerInteractEvent){
        Booster().BooosterUse(event)

     /*   if(event.item == CustomItems.Boooster){

            val eventAction: Action = event.action
            val eventItemType: Material? = event.item?.type
            val eventItem: ItemStack? = event.item
            val iteminoffHand =  event.player.inventory.itemInOffHand
            val iteminMainHand = event.player.inventory.itemInMainHand



            val test: Int = SameItemChecker().checkHandsForSameItems(eventAction, eventItemType,eventItem,
                event.player,iteminMainHand,iteminoffHand)

            if(test == 1){
                event.player.setVelocity(event.player.getLocation().direction.add(event.player.getLocation().direction.multiply(0.1)))

            }else if(test == 2){
                event.player.setVelocity(event.player.getLocation().direction.add(event.player.getLocation().direction.multiply(0.1)))

            }else{

            }
        }


*/

    }

}