package com.advancedplugin.plugin.supaadvanceplugin.Core

import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemFlag


@Suppress("DEPRECATION")
open class CustomItems {
    companion object {
        var BoneFixer: ItemStack = ItemStack(Material.COMPASS)
    }

    fun initialize(){
        createBoneFixer()
    }



    //Bone Fixer
    fun createBoneFixer(){
        val itmBoneFixer = ItemStack(Material.STICK,1)
        val boneFixer_Meta = itmBoneFixer.itemMeta
        boneFixer_Meta.setDisplayName("§4Bone Fixer")
        boneFixer_Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,1,true)
        val boneFixerLore = arrayListOf<String>()
        boneFixerLore.add("§7Test Lore")
        boneFixer_Meta.setLore(boneFixerLore)
        boneFixer_Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS)
        itmBoneFixer.setItemMeta(boneFixer_Meta)
        BoneFixer = itmBoneFixer

    }








}