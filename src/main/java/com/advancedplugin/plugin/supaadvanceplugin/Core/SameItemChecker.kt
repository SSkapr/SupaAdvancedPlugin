package com.advancedplugin.plugin.supaadvanceplugin.Core

import com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems.CustomItems
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffectType

class SameItemChecker: Listener {



    fun checkHandsForSameItems(_action: Action,_itemType: Material?,_item: ItemStack?,_eventPlayr: Player,_itemInMainHand: ItemStack,
    _itemInOffHand: ItemStack): Int{

        if((_action == Action.RIGHT_CLICK_AIR || _action == Action.RIGHT_CLICK_BLOCK ||
                    _action == Action.LEFT_CLICK_AIR || _action == Action.LEFT_CLICK_BLOCK)
            && _itemType == Material.STICK && _item == CustomItems.BoneFixer &&
            _itemInOffHand != CustomItems.BoneFixer){


           return 1
        }
        else if((_action == Action.RIGHT_CLICK_AIR || _action == Action.RIGHT_CLICK_BLOCK ||
                    _action == Action.LEFT_CLICK_AIR || _action == Action.LEFT_CLICK_BLOCK)
            && _itemType == Material.STICK && _item == CustomItems.BoneFixer  &&
            _itemInMainHand != CustomItems.BoneFixer){





            return 2

        }

        return 0

    }
}