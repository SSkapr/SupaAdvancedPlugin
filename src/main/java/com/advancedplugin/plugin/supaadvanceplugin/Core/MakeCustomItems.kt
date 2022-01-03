package com.advancedplugin.plugin.supaadvanceplugin.Core

import com.advancedplugin.plugin.supaadvanceplugin.Core.CustomItems.CustomItems

class MakeCustomItems {

    fun initializeItems(){
        CustomItems().createBoneFixer()
        CustomItems().createBooster()
    }

}