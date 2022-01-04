package com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe


@Suppress("DEPRECATION")
open class CustomItems {
    companion object {
        var BoneFixer: ItemStack = ItemStack(Material.COMPASS)
        var Boooster: ItemStack = ItemStack(Material.COMPASS)
    }





    //Bone Fixer - fixes bones
    fun createBoneFixer(){
        val itmBoneFixer = ItemStack(Material.STICK,1)
        val boneFixer_Meta = itmBoneFixer.itemMeta
        boneFixer_Meta.setDisplayName("§4Bone Fixer")
        boneFixer_Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,1,true)
        boneFixer_Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS)
        val boneFixerLore = arrayListOf<String>()
        boneFixerLore.add("§cYou need to hold only one to use it!!!!")
        boneFixerLore.add("§cWont work when you have this item in both hands!!!!!")
        boneFixer_Meta.setLore(boneFixerLore)
        itmBoneFixer.setItemMeta(boneFixer_Meta)
        BoneFixer = itmBoneFixer

        val cBoneFixer: ShapedRecipe = ShapedRecipe(NamespacedKey.minecraft("bone_fixer"), BoneFixer)
        cBoneFixer.shape("STS", "STS", "STS")

        cBoneFixer.setIngredient('S', Material.STRING)
        cBoneFixer.setIngredient('T', Material.STICK)
        Bukkit.getServer().addRecipe(cBoneFixer)

    }

    //Boooster - boosts player to height

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
     //   Boooster_meta.setDurability(364.toShort())
        itmBoooster.setItemMeta(Boooster_meta)

        Boooster = itmBoooster



    }








}