package com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems

import com.advancedplugin.plugin.supaadvanceplugin.Core.SameItemChecker
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack

class Booster: Listener {
    companion object{
        var Boooster: ItemStack = ItemStack(Material.COMPASS)
    }

    var durability = 10

    fun createBooster(){
        val itmBoooster = ItemStack(Material.FEATHER,1)
        val Boooster_meta = itmBoooster.itemMeta
        Boooster_meta.setDisplayName("§bBoooster")
        Boooster_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,1,true)
        Boooster_meta.addItemFlags(ItemFlag.HIDE_ENCHANTS)
        val BooosterLore = arrayListOf<String>()
        BooosterLore.add("§cYou need to hold only one to use it!!!!")
        BooosterLore.add("§cWont work when you have this item in both hands!!!!!")

        Boooster_meta.setLore(BooosterLore)

        itmBoooster.setItemMeta(Boooster_meta)
        Boooster = itmBoooster

    }

    @EventHandler
    fun BooosterUse(event: PlayerInteractEvent) {
        durability--

        if (event.item == Booster.Boooster) {

            val eventAction: Action = event.action
            val eventItemType: Material? = event.item?.type
            val eventItem: ItemStack? = event.item
            val iteminoffHand = event.player.inventory.itemInOffHand
            val iteminMainHand = event.player.inventory.itemInMainHand


            val test: Int = SameItemChecker().checkHandsForSameItems(
                eventAction, eventItemType, eventItem,
                event.player, iteminMainHand, iteminoffHand
            )

            if (test == 1) {
                event.player.setVelocity(
                    event.player.getLocation().direction.add(
                        event.player.getLocation().direction.multiply(
                            0.1
                        )
                    )
                )
                Booster().durability--
            } else if (test == 2) {
                event.player.setVelocity(
                    event.player.getLocation().direction.add(
                        event.player.getLocation().direction.multiply(
                            0.1
                        )
                    )
                )
                Booster().durability--
            } else {

            }

            if(durability == 0){
                event.player.inventory.remove(Boooster)
                durability = 10
            }

        }
    }
}






