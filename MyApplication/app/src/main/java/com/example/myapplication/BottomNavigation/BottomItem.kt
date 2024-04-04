package com.example.myapplication.BottomNavigation

import com.example.myapplication.R

    sealed class BottomItem (val title: String, val iconId: Int, val route:String) {
        object Screen1:BottomItem("Скрин 1", R.drawable.icon, "скрин_1" )
        object Screen2:BottomItem("Скрин 2", R.drawable.baseline_accessible_24, "скрин_2" )
        object Screen3:BottomItem("Скрин 3", R.drawable.icon2, "скрин_3" )
        object Screen4:BottomItem("Скрин 4", R.drawable.icon3, "скрин_4" )
    }
