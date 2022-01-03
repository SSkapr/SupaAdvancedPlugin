package com.advancedplugin.plugin.supaadvanceplugin.Core

import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect

class BetterPlayer(_player: Player) {


    val player = _player
    val currentPotionStatuses = mutableListOf<PotionEffect>()



    fun applyEffectinList(_player: Player){

        for(potionEffect: PotionEffect in currentPotionStatuses){

            _player.addPotionEffect(potionEffect)

        }
    }



}