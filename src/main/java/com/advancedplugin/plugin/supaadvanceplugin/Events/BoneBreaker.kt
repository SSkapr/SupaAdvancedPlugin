package com.advancedplugin.plugin.supaadvanceplugin.Events

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType


class BoneBreaker: Listener {



    @EventHandler
    fun onFallBreakbones(event: EntityDamageEvent) {
        if ((event.entity is Player)&&(event.cause == EntityDamageEvent.DamageCause.FALL)&&(event.damage > 5)) {

            (event.entity as Player).addPotionEffect(PotionEffect(PotionEffectType.SLOW, 3600, 4))
            event.entity.sendMessage("§eYou broke your leg")
        }
    }

}