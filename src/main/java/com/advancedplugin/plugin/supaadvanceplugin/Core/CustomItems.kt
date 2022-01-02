package com.advancedplugin.plugin.supaadvanceplugin.Core

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ShapedRecipe


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
        boneFixerLore.add("§cYou need to hold only one to use it!!!!")
        boneFixerLore.add("§cWont work when you have this item in both hands!!!!!")
        boneFixer_Meta.setLore(boneFixerLore)
        boneFixer_Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS)
        itmBoneFixer.setItemMeta(boneFixer_Meta)
        BoneFixer = itmBoneFixer

        val cBoneFixer: ShapedRecipe = ShapedRecipe(NamespacedKey.minecraft("bone_fixer"),BoneFixer)
        cBoneFixer.shape("STS", "STS", "STS")

        cBoneFixer.setIngredient('S', Material.STRING)
        cBoneFixer.setIngredient('T', Material.STICK)
        Bukkit.getServer().addRecipe(cBoneFixer)

    }








}